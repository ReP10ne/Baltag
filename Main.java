import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine(147, "Honda");

        Driver driver = new Driver("Водитель", 2);

        Lorry lorry = new Lorry("BMW", "Грузовик", 5000, driver, engine, 10000);

        System.out.println(lorry.toString());

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());

        lorry.getEngine().setManufacturer("BMW");

        System.out.println(lorry.toString());

        System.out.println("Производитель двигателя: " + lorry.getEngine().getManufacturer());
    }
}