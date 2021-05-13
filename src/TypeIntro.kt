const val MAX_XP: Int = 5000

fun main() {
    //VARIABLES
    var experiencePoints = 5
    var gold: Double = 50.0
    val playerName = "Estragon"
    var hasSteed: Boolean = false
    var menu = mutableListOf<String>("mead", "beer", "LaCroix")
    val pubName = "Unicorn's Horn"
    var publicanName = "Dragoras Malfoy"
    var mirrorEffect: String

    //ACTIONS
    experiencePoints += 5
    mirrorEffect = playerName.reversed()

    //OUTPUT
    println("Nome do jogador: $playerName")
    println("XP: $experiencePoints")
    println("Gold: $gold")
    println("Tem animal? $hasSteed")
    println("Menu do bar: $menu")
    println("Nome do pub: $pubName")
    println("Atendente do bar: $publicanName")
    println("Efeito do espelho: $mirrorEffect")
}