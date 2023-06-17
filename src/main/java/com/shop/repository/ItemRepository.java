package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {


    List<Item> findByItemName(String itemNm);

    List<Item> findByItemNameOrItemDetail(String itemNm, String itemDetail);

    List<Item> findByPriceLessThan(Integer price);

    // 아래와 같은 다양한 jpa keyword 사용 가능
    List<Item> findByPriceLessThanOrderByPriceDesc(Integer price);

    //jpql
    @Query("select i from Item i where i.itemDetail like %:itemDetail% order by i.price desc")
    List<Item> findByItemDetail(@Param("itemDetail") String itemDetail);
    // ?1 표현은 itemDetail 대신 @param을 사용해서 첫번째 파라미터를 전달하겠다는 표현
//    @Query("select i from Item i where i.itemDetail like %?1% order by i.price desc")

    @Query(value="select * from item i where i.item_detail like " +
            "%:itemDetail% order by i.price desc", nativeQuery = true)
    List<Item> findByItemDetailByNative(@Param("itemDetail") String itemDetail);
}
