import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))

    val a = br.readLine().toInt()
    val answer = recurse(a)
    println(answer)
}

fun recurse(num: Int): Long {
    return if (num > 1) {
        num.toLong() * recurse(num - 1)
    } else {
        1
    }
}
