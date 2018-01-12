package by.bsuir.dissertation.entity;

import java.util.Objects;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import by.bsuir.dissertation.util.DissertationConstants;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "car")
public class Car {

    @Id
    private String id;

    @Field
    private double speed;

    public Car() {
        id = UUID.randomUUID().toString();
        speed = DissertationConstants.CAR_MOVEMENT.INITIAL_SPEED;
    }

    public Car(String id, double speed) {
        this.id = id;
        this.speed = speed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Double.compare(car.speed, speed) == 0 &&
                Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, speed);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("id='").append(id).append('\'');
        sb.append(", speed=").append(speed);
        sb.append('}');
        return sb.toString();
    }
}
