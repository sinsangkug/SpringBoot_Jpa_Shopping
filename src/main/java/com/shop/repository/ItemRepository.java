package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/*
중요! 참고! d dsadad
 d
    Spring Data JPA는 쿼리 메소드를 사용하여 간단하고 효율적으로 데이터베이스를 조작할 수 있습니다. Spring Data JPA에서 제공하는 쿼리 메소드의 종류는 다음과 같습니다.

        메소드 이름으로 쿼리 생성: 메소드 이름을 기반으로 자동으로 쿼리를 생성하는 방법입니다. 메소드 이름은 특정한 규칙을 따라야 하며, findBy, getOneBy, queryBy 등의 접두사를 사용할 수 있습니다.

        JPQL 쿼리 사용: @Query 어노테이션을 사용하여 JPQL 쿼리를 정의하고 실행할 수 있습니다.

        Native SQL 사용: @Query 어노테이션을 사용하여 Native SQL 쿼리를 정의하고 실행할 수 있습니다.

        Named 쿼리 사용: @NamedQuery 어노테이션을 사용하여 이름을 지정한 JPQL 쿼리를 사용할 수 있습니다.

        @Query 어노테이션에서 파라미터 바인딩: @Query 어노테이션에서 파라미터를 바인딩하여 동적으로 쿼리를 생성할 수 있습니다.

        메소드 이름에서 파라미터 바인딩: 메소드 이름에서 파라미터를 바인딩하여 동적으로 쿼리를 생성할 수 있습니다.

        Sort 및 Pageable 인터페이스 사용: 쿼리 결과를 정렬하고 페이지네이션을 지원하는 Sort 및 Pageable 인터페이스를 사용할 수 있습니다.

        Spring Data JPA는 이 외에도 다양한 기능을 제공합니다. 예를 들어, 동적 쿼리 생성, 쿼리 메소드의 반환 타입 지정, 쿼리 메소드에 SpEL 표현식 사용 등이 있습니다.
  */

public interface ItemRepository extends JpaRepository<Item, Long> {


    //참고.
    //쿼리메소드?
    //Spring data jpa에서 제공하는 핵심 기능 중 하나로  Respository인터페이스에 간단한 네이밍 규칙을 이용하여
    //메소드를 작성하면 원하는 쿼리를 실행할 수 있습니다.

    //생성할 메소드 명을 정하는 문법
    //find + 엔티티명 + By + 변수명
    //find + 엔티티명 + By + 변수명  중에서  엔티티명은 생략 가능 -> find  + By + 변수명

    //아래 추상메소드가 하는 역할 : 쿼리 메소드를 이용해 상품 조회
    List<Item> findByItemNm(String itemNm);  //itemNm(상품명)으로 데이터를 조회 하기 위해 By 뒤에 필드명인 ItemNum을 메소드의 이름에 붙여 줍니다.
                                             //엔티티명은 생략 가능하므로 findItemByItemNm 대신에 findByItemNum으로 메소드명을 만들어 줍니다.
                                             //String itemNm 매개변수는 검색할 때 사용할 상품명 변수를 넘겨 줍니다.
}

