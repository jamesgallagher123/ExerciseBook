var vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
var employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]

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
                        var colour: String,
                        var fixed: Boolean) {}

class Car(id: Int,
          model: String,
          reg: String,
          tyres: Int,
          doors: Int,
          colour: String,
          fixed: Boolean) extends Vehicle(id, model, reg, tyres, colour, fixed) {
    override def toString: String = {
        s"ID: $id. Model: $model. Reg: $reg. Tyres: $tyres. Doors: $doors. Colour: $colour."
    }
}

class Bike(id: Int,
           model: String,
           reg: String,
           tyres: Int,
           colour: String,
           fixed: Boolean) extends Vehicle(id, model, reg, tyres, colour, fixed) {
    override def toString: String = {
        s"ID: $id Model: $model. Reg: $reg. Tyres: $tyres. Colour: $colour"
    }
}

class Garage(var isOpen: Boolean = false) {
    def addVehicle(vehicle: Vehicle): Unit = {
        vehicleArrayBuffer += vehicle
    }

    def removeVehicleByID(id: Int): Unit = {
        vehicleArrayBuffer.foreach(x => if (x.id == id) {
            vehicleArrayBuffer -= x
            return
        })
    }

    def removeVehicleByType(classType: String): Unit = {
        classType match {
            case "Car" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Car]) vehicleArrayBuffer -= x)
            case "Bike" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Bike]) vehicleArrayBuffer -= x)
            case _ => println("Please pass string Car or Bike.")
        }
    }

    def viewContents(): Unit = {
        println("Vehicles:")
        if (vehicleArrayBuffer.isEmpty) {
            println("There are no vehicles.")
        } else {
            vehicleArrayBuffer.foreach(println)
        }
        println("Employees:")
        if (employeeArrayBuffer.isEmpty) {
            println("There are no employees.")
        } else {
            employeeArrayBuffer.foreach(println)
        }
    }

    def fixed(vehicle: Vehicle): Unit = {
        if (vehicle.fixed) {
            println("The vehicle is fixed.")
        } else {
            println("The vehicle is not fixed.")
        }
    }

    def registerEmployee(employee: Employee): Unit = {
        employeeArrayBuffer += employee
    }

    def open(): Unit = {
        this.isOpen = true
    }

    def close(): Unit = {
        this.isOpen = false
    }

}

val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
                                "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")

val customer1 = new Customer("Adam", "Dye", "15/02/93", "10 Scouse Lane", "L10 123",
                                "adam.dye@qa.com", "078989898998", 1)

val car1 = new Car(1, "Ford Focus", "ABC123", 4, 5, "Red", true)

val bike1 = new Bike(2, "Yamaha", "XYZ123", 2, "Pink", false)

val garage = new Garage()

garage.addVehicle(car1)
// garage.addVehicle(bike1)

// garage.registerEmployee(employee1)

//garage.removeVehicleByID(1)
// garage.removeVehicleByType("Bike")

garage.viewContents()

garage.fixed(car1)
garage.fixed(bike1)