@file:Suppress("PackageDirectoryMismatch", "MemberVisibilityCanBePrivate")

package com.tidu.cp.cf._231.a

/* ------------------ START SUBMISSION ------------------ */
import java.io.BufferedOutputStream
import java.io.InputStream
import java.io.PrintStream
import java.io.PrintWriter
import java.util.*

fun solve(tc: Int) {}

fun main() {
    setUpIO()
    var tc = 1
// TODO: no tc input for single test
//    tc = i.int()
    flush { for (c in 1..tc) solve(c) }
}

fun setUpIO() {
    i = FastIn()
    o = PrintWriter(BufferedOutputStream(OUTPUT), false)
}

var INPUT: InputStream = System.`in`
var OUTPUT: PrintStream = System.out
lateinit var i: FastIn
lateinit var o: PrintWriter
inline fun flush(block: PrintWriter.() -> Unit) = o.apply(block).flush()
class FastIn {
    val br = INPUT.bufferedReader()
    var st: StringTokenizer? = null

    operator fun next(): String {
        while (st == null || !st!!.hasMoreElements()) st = StringTokenizer(br.readLine() ?: return "", " ")
        return st!!.nextToken()
    }

    fun int() = next().toInt()
    fun long() = next().toLong()
    fun double() = next().toDouble()
    fun line() = br.readLine()!!
    fun str(n: Int) = List(n) { next() }
    fun lines(n: Int) = List(n) { line() }
    fun ints(n: Int) = List(n) { int() }
    fun intArr(n: Int) = IntArray(n) { int() }
    fun doubles(n: Int) = List(n) { double() }
    fun doubleArr(n: Int) = DoubleArray(n) { double() }
    fun longs(n: Int) = List(n) { long() }
    fun longArr(n: Int) = LongArray(n) { long() }
}
/* ------------------ END SUBMISSION ------------------ */
