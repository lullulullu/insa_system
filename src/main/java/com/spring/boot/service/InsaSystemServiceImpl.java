package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.spring.boot.dto.InsaSystemDTO;
import com.spring.boot.mapper.InsaSystemMapper;

@Service
public class InsaSystemServiceImpl implements InsaSystemService{
	
	@Autowired
	private InsaSystemMapper insasystemMapper;

	@Override
	public int maxNum() throws Exception {
		return insasystemMapper.maxNum();
	}

	@Override
	public void insertData(InsaSystemDTO dto) throws Exception {
		
		
	}

	@Override
	public int getDataCount(String searchKey, String searchValue) throws Exception {
		return insasystemMapper.getDataCount(searchKey, searchValue);
	}

	@Override
	public List<InsaSystemDTO> getList(int start, int end, String searchKey, String searchValue) throws Exception {
		return insasystemMapper.getList(start, end, searchKey, searchValue);
	}

	@Override
	public InsaSystemDTO getReadData(int sabun) throws Exception {
		return insasystemMapper.getReadData(sabun);
	}

	@Override
	public void updateData(InsaSystemDTO dto) throws Exception {
		
	}

	@Override
	public void deleteData(int sabun) throws Exception {
		
	}
	

}
