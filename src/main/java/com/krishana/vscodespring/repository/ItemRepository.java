package com.krishana.vscodespring.repository;

import com.krishana.vscodespring.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item,Long>{
}
