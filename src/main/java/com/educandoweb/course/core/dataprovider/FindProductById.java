package com.educandoweb.course.core.dataprovider;

import com.educandoweb.course.core.domain.Product;
import java.util.Optional;
import java.util.UUID;

public interface FindProductById {

    Optional<Product> findById(UUID id);
}
