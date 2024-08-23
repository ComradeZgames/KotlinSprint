package org.example.lesson_2

fun main() {
    val buffPercent = 20
    val ironOreCount = 11
    val crystalOreCount = 7

    val bonusIronOre = (ironOreCount * (buffPercent / 100f)).toInt()
    val bonusCrystalOre = (crystalOreCount * (buffPercent / 100f)).toInt()

    println("Bonus amount of iron ore: $bonusIronOre\nBonus amount of crystal ore: $bonusCrystalOre")
}