package com.spring.boot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.spring.boot.dto.InsaSystemDTO;

@Mapper
public interface InsaSystemMapper {

	//데이터 넘버(페이징 처리)
	public int maxNum() throws Exception;
	
	//인서트 
	public void insertData(InsaSystemDTO dto) throws Exception;
	
	//Data 갯수카운팅
	public int getDataCount(String searchKey, String searchValue) throws Exception;
	
	//List 출력
	public List<InsaSystemDTO> getList(int start, int end, String searchKey, String searchValue) throws Exception;

	//하나의 데이터 읽어올거야
	public InsaSystemDTO getReadData(int sabun) throws Exception;
	
	//데이터 수정
	public void updateData(InsaSystemDTO dto) throws Exception;
	
	//데이터 삭제
	public void deleteData(int sabun) throws Exception;	
	
}
