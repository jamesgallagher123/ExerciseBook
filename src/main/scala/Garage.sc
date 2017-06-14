var vehicleArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Vehicle]
var employeeArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Employee]
var partArrayBuffer = scala.collection.mutable.ArrayBuffer.empty[Part]
val random = scala.util.Random

val garage = new Garage(true)

var engine = new Part("Engine")
var gearBox = new Part("Gear Box")
var frontLight = new Part("Front Light")
var backLight = new Part("Back Light")
var transmission = new Part("Transmission")
var ignition = new Part("Ignition")
var fuelTank = new Part("Fuel Tank")
var indicators = new Part("Indicators")
var battery = new Part("Battery")
var exhaust = new Part("Exhaust")
var suspension = new Part("Suspension")
var filtration = new Part("Filtration")
var brakePad = new Part("Brake Pad")
var pistonRing = new Part("Piston Ring")
var sumpPlug = new Part("Sump Plug")
var oilPump = new Part("Oil Pump")
var timingBelt = new Part("Timing Belt")
var turboCharger = new Part("Turbo Charger")
var driveBelt = new Part("Drive Belt")
var headBolt = new Part("Head Bolt")
var starterMotor = new Part("Starter Motor")
var alternator = new Part("Alternator")
var spring = new Part("Spring")
var engineMount = new Part("Engine Part")
var catalyticConverter = new Part("Catalytic Converter")
var acceleratorCable = new Part("Accelerator Cable")
var clutchCable = new Part("Clutch Cable")
var clutch = new Part("Catch")
var wheelBolt = new Part("Wheel Bolt")
var vacuumPumps = new Part("Vacuum Pumps")
var calipers = new Part("Calipers")

val employee1 = new Employee("James", "Gallagher", "10/09/95", "2 Ogden Street", "M25 1JL",
    "james.gallagher@qa.com", "07892952449", 1, "Scala Developer")

val customer1 = new Customer("Adam", "Dye", "15/02/93", "10 Scouse Lane", "L10 123",
    "adam.dye@qa.com", "078989898998", 1)

val car1 = new Car("Ford Focus", "ABC123", 4, 5, "Red", true)

val bike1 = new Bike("Yamaha", "XYZ123", 2, "Pink", false)

car1.parts.foreach(x => println)

garage.registerEmployee(employee1)

partArrayBuffer.foreach(println)

//garage.removeVehicleByID(1)
// garage.removeVehicleByType("Bike")

garage.viewContents()

class Garage(var isOpen: Boolean) {
    def addVehicle(vehicle: Vehicle): Unit = {
        vehicleArrayBuffer += vehicle
    }

    def removeVehicleByID(id: Int): Unit = {
        vehicleArrayBuffer.foreach(x => if (x.id == id) {
            vehicleArrayBuffer -= x
        })
    }

    def removeVehicleByType(classType: String): Unit = {
        classType match {
            case "Car" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Car]) vehicleArrayBuffer -= x)
            case "Bike" => vehicleArrayBuffer.foreach(x => if (x.isInstanceOf[Bike]) vehicleArrayBuffer -= x)
            case _ => println("Please enter string Car or Bike.")
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

    def fix(vehicle: Vehicle): Unit = {
        vehicle.fixed = true
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

abstract class Person() {
    val firstName: String
    var surname: String
    val dateOfBirth: String
    val address: String
    var postcode: String
    var email: String
    var phoneNumber: String
}

class Employee(val firstName: String,
               var surname: String,
               val dateOfBirth: String,
               val address: String,
               var postcode: String,
               var email: String,
               var phoneNumber: String,
               val employeeID: Int,
               var job: String) extends Person() {
    override def toString: String = {
        s"Name: $firstName $surname. DOB: $dateOfBirth. Address: $address. Postcode: $postcode. Email: $email. Phone number: $phoneNumber. ID: $employeeID. Job: $job."
    }
}

class Customer(val firstName: String,
               var surname: String,
               val dateOfBirth: String,
               val address: String,
               var postcode: String,
               var email: String,
               var phoneNumber: String,
               val customerID: Int) extends Person () {
    override def toString: String = {
        s"Name: $firstName $surname. DOB: $dateOfBirth. Address: $address. Postcode: $postcode. Email: $email. Phone number: $phoneNumber. ID: $customerID"
    }
}

abstract class Vehicle () {
    var id: Int = 1
    if (vehicleArrayBuffer.isEmpty) {
        id = 1
    } else {
        id = vehicleArrayBuffer.last.id + 1
    }
    val model: String
    val reg: String
    val tyres: Int
    var colour: String
    var fixed: Boolean
    var parts = scala.collection.mutable.ArrayBuffer.empty[Part]
    parts = partArrayBuffer
    parts.foreach(x => {
        x.fixTime = 1 + random.nextInt(10)
        x.price = 10 + random.nextInt(40)
        })
    garage.addVehicle(this)
}

class Car(val model: String,
          val reg: String,
          val tyres: Int,
          var doors: Int,
          var colour: String,
          var fixed: Boolean) extends Vehicle() {
    override def toString: String = {
        s"ID: $id. Model: $model. Reg: $reg. Tyres: $tyres. Doors: $doors. Colour: $colour."
    }
}

class Bike(val model: String,
           val reg: String,
           val tyres: Int,
           var colour: String,
           var fixed: Boolean) extends Vehicle() {
    override def toString: String = {
        s"ID: $id Model: $model. Reg: $reg. Tyres: $tyres. Colour: $colour"
    }
}

class Part(val name: String) {
    var fixTime = 0
    var price = 0
    var isBroken = false
    partArrayBuffer += this
    override def toString: String = {
        s"Name $name. Price: £$price. Time taken to fix: $fixTime hours."
        if (isBroken == false) {

        } else {

        }
    }
}