package ru.detector.repos;

import org.springframework.data.repository.CrudRepository;
import ru.detector.domain.Detector;

/**
 * Репозиторий для доступа к бд с детектором.
 */
public interface DetectorRepo  extends CrudRepository<Detector, Integer> {

}
