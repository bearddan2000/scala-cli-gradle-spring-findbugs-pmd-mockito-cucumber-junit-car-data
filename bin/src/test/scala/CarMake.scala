import io.cucumber.java.en.Then;

import org.junit.jupiter.api.Assertions;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import example.model.Car;
import example.service._

@ExtendWith(Array(classOf[MockitoExtension]))
class CarMake {

  @InjectMocks
  val service = new CarServiceImpl();

  @Then("Car make should be test")
  def checkMake(): Unit  = {
    val car = service.createCar();
    Assertions.assertEquals(car.make, "test");
  }
}
