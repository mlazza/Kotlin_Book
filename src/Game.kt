fun main() {
    val name = "Madrigal"
    val healthPoints = 15
    val isBlessed = true
    val isImmortal = false

    //Aura
    //if(isBlessed && healthPoints > 50 || isImmortal){
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    val auraColor = if (auraVisible) "GREEN" else "NONE"
    println(auraColor)

    val healthStatus = when(healthPoints){
        100 -> "is in excellent condition!"
        in 90..99 -> "has a few scratches."
        in 75..89 -> if (isBlessed) {
            "has some minor wounds but is healing quite quickly!"
            } else {
                "has some minor wounds."
            }
        in 15..74 -> "looks pretty hurt."
        else -> "is in awful condition!"
    }

    // Player Status
    println(name + " " + healthStatus)
}
