package com.ezen.royal.client.communication.service;

import org.springframework.ui.Model;

import com.ezen.royal.client.communication.util.NoticeListVO;

public interface NoticeService {
	
	void getNoticeList(Model model);

	void getNoticeDTO(int notice_id, Model model);
	
	void getNoticeList_part(Model model, Integer royal_id);
	
	void search(Model model, String searchType, String searchString);

	int countBoard(Integer royal_id);

	void selectBoard(Model model, Integer royal_id, NoticeListVO vo, Integer nowPage, Integer pagePostCnt);
	
	
	int countSearchResult(String searchType, String searchString);
	
	void searchListPaging(Model model, String searchType, String searchString, 
			NoticeListVO vo, Integer nowPage, Integer pagePostCnt);

}
