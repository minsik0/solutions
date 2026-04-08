# [level 2] 조건에 맞는 아이템들의 가격의 총합 구하기 - 273709 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/273709) 

### 성능 요약

메모리: undefined, 시간: 

### 구분

코딩테스트 연습 > 합계， 최대값， 최소값

### 채점결과

합계: true / 100.0

### 제출 일자

2026년 04월 08일 13:44:53

### 문제 설명

<p>다음은 어느 한 게임에서 사용되는 아이템들의 아이템 정보를 담은 <code>ITEM_INFO</code> 테이블입니다. <code>ITEM_INFO</code> 테이블은 다음과 같으며, <code>ITEM_ID</code>, <code>ITEM_NAME</code>, <code>RARITY</code>, <code>PRICE</code>는 각각 아이템 ID, 아이템 명, 아이템의 희귀도, 아이템의 가격을 나타냅니다.</p>
<table class="table">
        <thead><tr>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">열 이름</font></font></th>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">유형</font></font></th>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">널 가능</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_ID</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">정수</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">품목명</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">VARCHAR(N)</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">희박</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">정수</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">거짓</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">가격</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">정수</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">거짓</font></font></td>
</tr>
</tbody>
      </table>
<hr>

<h5>문제</h5>

<p><code>ITEM_INFO</code> 테이블에서 희귀도가 'LEGEND'인  아이템들의 가격의 총합을 구하는 SQL문을 작성해 주세요. 이때 컬럼명은 'TOTAL_PRICE'로 지정해 주세요.</p>

<hr>

<h5>예시</h5>

<p>예를 들어 <code>ITEM_INFO</code> 테이블이 다음과 같다면</p>
<table class="table">
        <thead><tr>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_ID</font></font></th>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">품목명</font></font></th>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">희박</font></font></th>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">가격</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">0</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_A</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">흔한</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">10000</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">1</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_B</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">전설</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">9000</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">2</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_C</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">전설</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">11000</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">3</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_D</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">고유한</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">10000</font></font></td>
</tr>
<tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">4</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">ITEM_E</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">전설</font></font></td>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">12000</font></font></td>
</tr>
</tbody>
      </table>
<p>조건에 해당되는 아이템의 아이템 ID는 1, 2, 4이며 각 아이템들의 가격은 9000, 11000, 12000 이므로 조건에 해당되는 아이템들의 가격의 합은 다음과 같습니다.</p>
<table class="table">
        <thead><tr>
<th><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">총 가격</font></font></th>
</tr>
</thead>
        <tbody><tr>
<td><font dir="auto" style="vertical-align: inherit;"><font dir="auto" style="vertical-align: inherit;">32000</font></font></td>
</tr>
</tbody>
      </table>
<hr>

<p>※ 참고: 본 문제는 제출 내역 확인 기능을 지원하지 않습니다.</p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges