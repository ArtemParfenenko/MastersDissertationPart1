package by.bsuir.dissertation.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import by.bsuir.dissertation.entity.Way;

public interface WayRepository extends MongoRepository<Way, String> {
}