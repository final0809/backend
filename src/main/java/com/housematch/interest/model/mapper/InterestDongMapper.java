package com.housematch.interest.model.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.housematch.interest.model.dto.InterestDongDto;

@Mapper
public interface InterestDongMapper {

	List<InterestDongDto> selectInterestDongList(String id);

	int insertInterestDong(InterestDongDto interestDongDto);

	int deleteInterestDong(InterestDongDto interestDongDto);

	int getTotalInterestDongCount(Map<String, Object> map);

}
