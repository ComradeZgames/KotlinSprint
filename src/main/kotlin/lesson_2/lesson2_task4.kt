package org.example.lesson_2

const val BUFF_PERCENT = 0.2f

fun main() {
    val ironOreCount = 11
    val crystalOreCount = 7

    val bonusIronOre = (ironOreCount * BUFF_PERCENT).toInt()
    val bonusCrystalOre = (crystalOreCount * BUFF_PERCENT).toInt()

    println("Bonus amount of iron ore: $bonusIronOre\nBonus amount of crystal ore: $bonusCrystalOre")
}