fun main()
{
  println("Вас приветствует программа Калькулятор длины окружности L и площади круга S.")
  println("Программа создана KvantoriumTeam.")
  println("Число π всегда равно 3,14(примерно)")
  val pi = 3.14
  println (pi)
  print("Введите радиус окружности.")
  println(" После введения нажмите Enter.")
    val R = readLine()!!.toInt()
    val R2 = R*R
    val L = 2 * pi * R
    val S = pi * R2
  println("L = $L")
  println("S = $S")
}
