fun main() {

    // TODO 1
    val vehicle = mapOf<String, String>(
            "type" to "Motorcycle",
            "maxSpeed" to "230Km/s",
            "maxTank" to "10Ltr"
    )

    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]
    val maxTank = vehicle["maxTank"]

    // TODO 3
    println("Vehicle" + '\n'
            + "Type: $type" + '\n'
            + "Maximal Speed: $maxSpeed" + '\n'
            + "Maximal Tank: $maxTank"
    )

}