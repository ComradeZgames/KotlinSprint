package org.example.lesson_2

fun main() {
    val buffPercent = 20
    val ironOreCount = 11
    val crystalOreCount = 7

    val bonusIronOre = (ironOreCount * (BUFF_PERCENT/100f)).toInt()
    val bonusCrystalOre = (crystalOreCount * BUFF_PERCENT).toInt()

    println("Bonus amount of iron ore: $bonusIronOre\nBonus amount of crystal ore: $bonusCrystalOre")
}