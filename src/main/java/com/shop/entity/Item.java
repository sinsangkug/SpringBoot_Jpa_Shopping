package com.shop.entity;

import com.shop.constant.ItemSellStatus;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

/*import javax.persistence.*;
import com.shop.dto.ItemFormDto;
import com.shop.exception.OutOfStockException;*/


//상품 엔티티 테이블 생성 설계하기


@Entity
@Table(name="item")
@Getter
@Setter
@ToString
public class Item {
    @Id
    @Column(name="item_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id; //상품 코드

    @Column(nullable = false, length = 50)
    private String itemNm; //상품명

    @Column(name="price", nullable = false)
    private int price; //가격

    @Column(nullable = false)
    private int stockNumber; //재고수량

    @Lob
    @Column(nullable = false)
    private String itemDetail; //상품 상세 설명

    @Enumerated(EnumType.STRING)
    private ItemSellStatus itemSellStatus; //상품 판매 상태
    //판매 상태의 경우 재고가 없거나, 상품을 미리 등록해 놓고 나중에 '판매 중' 상태로 바꾸거나 재고가 없을 때는 프론트에 노출시키지 않기 위해서 판매 상태를 코드로 갖고 있겠습니다.
    
    private LocalDateTime regTime; //등록 시간
    private LocalDateTime updateTime; //수정 시간
    //상품 등록 시간과 수정 시간을 LocalDateTime 타입으로 선언해줬습니다.

/*
참고!!!!!

LocalDateTime은 Java 8 이상에서 제공하는 날짜와 시간 정보를 표현하는 클래스입니다.
이 클래스는 시간대(time zone) 정보가 없는 로컬(local) 날짜와 시간 정보를 표현합니다.

LocalDateTime은 년, 월, 일, 시, 분, 초, 나노초 정보를 모두 저장할 수 있습니다.
이 정보를 사용하여 시간 계산과 포맷팅 등을 처리할 수 있습니다.


예를 들어, 현재 시간을 LocalDateTime으로 표현하면 다음과 같습니다.

LocalDateTime now = LocalDateTime.now();
System.out.println(now);
이 코드를 실행하면 현재 시간을 다음과 같은 형식으로 출력합니다.
2023-04-22T12:34:56.789

LocalDateTime은 시간대 정보가 없기 때문에 시간대 변환 작업을 수동으로 처리해야 합니다.
시간대 정보를 처리해야 하는 경우에는 ZonedDateTime 클래스를 사용하는 것이 좋습니다.

*/



}