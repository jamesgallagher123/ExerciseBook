abstract class Person(val firstName: String,
                       var surname: String,
                       val dateOfBirth: String,
                       val address: String,
                       var postcode: String,
                       var email: String,
                       var phoneNumber: String) {}

class Employee(firstName: String,
               surname: String,
               dateOfBirth: String,
               address: String,
               postcode: String,
               email: String,
               phoneNumber: String,
               val employeeID: Int,
               var job: String) extends Person(firstName, surname, dateOfBirth, address, postcode, email, phoneNumber) {
    override def toString: String = {
        s"Name: $firstName $surname. DOB: $dateOfBirth. Address: $address. Postcode: $postcode. Email: $email. Phone number: $phoneNumber. ID: $employeeID. Job: $job."
    }
}

class Customer(firstName: String,
               surname: String,
               dateOfBirth: String,
               address: String,
               postcode: String,
               email: String,
               phoneNumber: String,
               val customerID: Int) extends Person (firstName, surname, dateOfBirth, address, postcode, email, phoneNumber) {
    override def toString: String = {
        s"Name: $firstName $surname. DOB: $dateOfBirth. Address: $address. Postcode: $postcode. Email: $email. Phone number: $phoneNumber. ID: $customerID"
    }
}

abstract class Vehicle (val id: Int,
                        val model: String,
                        val reg: String,
                        val tyres: Int,
                        var colour: String) {}

class Car(id: Int,
          model: String,
          reg: String,
          tyres: Int,
          doors: Int,
          colour: String) extends Vehicle(id, model, reg, tyres, colour) {
    override def toString: String = {
        s"Model: $model. Reg: $reg. Tyres: $tyres. Doors: $doors. Colour: $colour."
    }
}

class Bike(id: Int,
           model: String,
           reg: String,
           tyres: Int,
           colour: String) extends Vehicle(id, model, reg, tyres, colour) {
    override def toString: String = {
        s"Model: $model. Reg: $reg. Tyres: $tyres. Colour: $colour"
    }
}

class Garage() {
    var vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
    var employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]

    def addVehicle(vehicle: Vehicle): Unit = {
        vehicleArrayBuffer += vehicle
    }

    def viewVehicles(): Unit = {
        vehicleArrayBuffer.foreach(println)
    }

    def removeVehicle(): Unit = {

    }

    def registerEmployee(employee: Employee): Unit = {
        employeeArrayBuffer += employee
    }

    def viewEmployees(): Unit = {
        employeeArrayBuffer.foreach(println)
    }
}

val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
                                "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")

val customer1 = new Customer("Adam", "Dye", "15/02/93", "10 Scouse Lane", "L10 123",
                                "adam.dye@qa.com", "078989898998", 1)

val car1 = new Car("Ford Focus", "ABC123", 4, 5, "Red")

val bike1 = new Bike("Yamaha", "XYZ123", 2, "Pink")

val garage = new Garage

garage.addVehicle(car1)
garage.addVehicle(bike1)

garage.viewVehicles()

garage.registerEmployee(employee1)

garage.viewEmployees()