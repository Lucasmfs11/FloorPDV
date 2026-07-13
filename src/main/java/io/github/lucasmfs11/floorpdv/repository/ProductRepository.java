package io.github.lucasmfs11.floorpdv.repository;

import aj.org.objectweb.asm.commons.Remapper;
import io.github.lucasmfs11.floorpdv.entity.Product;
import jakarta.persistence.metamodel.SingularAttribute;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface ProductRepository  extends JpaRepository<Product,Long>
{

}
