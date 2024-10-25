package Basics

fun partition(arr: Array<Int>, start: Int, end: Int): Int {

    val pivot = arr[start]
    var count = 0

    for (i in start + 1..end) {
        if (arr[i] <= pivot) count++
    }
    var pivotindex = start + count
    arr[start] = arr[pivotindex].also { arr[pivotindex] = arr[start] }
    var i = start
    var j = end
    while (i < pivotindex && j > pivotindex) {
        while (arr[i] < pivot) {
            i++
        }
        while (arr[j] > pivot) {
            j--
        }
        if (i < pivotindex && j > pivotindex) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i++
            j--
        }
    }
    return pivotindex
}

fun quicksort(arr: Array<Int>, start: Int, end: Int) {
    if (start >= end) return
    val p: Int
    p = partition(arr, start, end)
    quicksort(arr, start, p - 1)
    quicksort(arr, p + 1, end)

}

fun main() {
    val arr: Array<Int> = arrayOf(1, 27, 3, 24, 5, 16)
    val start = 0
    val end = arr.size - 1
    quicksort(arr, start, end)
    for (i in arr) print("$i ")
}