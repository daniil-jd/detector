package ru.detector.repos;

import org.springframework.data.repository.CrudRepository;
import ru.detector.domain.Detector;

public interface DetectorRepo  extends CrudRepository<Detector, Integer> {

}
