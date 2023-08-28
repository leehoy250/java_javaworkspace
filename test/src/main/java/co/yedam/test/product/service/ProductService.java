package co.yedam.test.product.service;

import java.util.List;

public interface ProductService {
	List<ProductVO> productSelectList();   // R 전체조회
	ProductVO productSelect(ProductVO vo); // R 하나의 제품 조회
	int productInsert(ProductVO vo); // C 제품 등록 / productInsert = product: 테이블명, Insert: 쿼리명 
	int productDelete(ProductVO vo); // D 제품 삭제
	int productUpdate(ProductVO vo); // U 제품 변경
}
