
User(회원), Ticketing(예매 목록), Like(찜 목록), Seen(본 공연), 
Review(리뷰게시판), Reply(리뷰게시판 댓글), Question(문의사항),
Comment(문의사항 댓글), Notice(공지사항), 
Hall(공연장), Rank(공연 순위), Detail(공연 상세정보)



--문의 게시판

SELECT * FROM TBL_Question;
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'USER11','행사 관련 문의드립니다','밤의 아리아 행사 티켓 오픈일 궁금합니다',SYSDATE);
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'USER01','첫회원은 혜택 없나요?','제가 첫 회원인데요',SYSDATE);
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'USER05','예매 취소 할 수 있나요?','사정이 생겨서 못갈듯 싶은데..',SYSDATE);
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'TWEETY','박물관 정보는 없나요?','공연은 관심 없는데',SYSDATE);
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'USER04','예매창이 안열려요','답답하네요',SYSDATE);
INSERT INTO TBL_Question VALUES(SEQ_Que.NEXTVAL,'TWEETY','국악은 순위에 없네요..','가슴이 아픕니다',SYSDATE);


INSERT INTO TBL_QComment VALUES(SEQ_QueCommen.NEXTVAL, 1, 'ADMIN','문의 주셔서 감사합니다. 티켓 오픈일은 미정이며, 추후 공지 예정입니다. 감사합니다.', SYSDATE);
INSERT INTO TBL_QComment VALUES(SEQ_QueCommen.NEXTVAL, 2, 'ADMIN','안녕하세요 컬쳐쇼크입니다. 첫 회원분에게 주어지는 특별한 혜택은 없습니다. 문의 주셔서 감사합니다.', SYSDATE);
INSERT INTO TBL_QComment VALUES(SEQ_QueCommen.NEXTVAL, 3, 'ADMIN','안녕하세요 컬쳐쇼크입니다. 공연 당일 취소는 불가하며, 당일이 아니시라며 예매내역창에서 예매 취소가 가능합니다. 문의 주셔서 감사합니다.', SYSDATE);
INSERT INTO TBL_QComment VALUES(SEQ_QueCommen.NEXTVAL, 4, 'ADMIN','안녕하세요 컬쳐쇼크입니다. 현재 컬쳐쇼크에서는 박물관 전시 정보는 제공하고 있지 않습니다. 전시 프로그램 정보 제공도 논의해 보겠습니다. 문의 주셔서 감사합니다..', SYSDATE);
INSERT INTO TBL_QComment VALUES(SEQ_QueCommen.NEXTVAL, 5, 'ADMIN','안녕하세요 컬쳐쇼크입니다. 브라우저 창을 재부팅 후 다시 시도해보시기 바랍니다. 문의 주셔서 감사합니다.', SYSDATE);
SELECT * FROM TBL_QComment;
COMMIT;

--리뷰게시판

INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','카르멘의 야성은 정말이지','대단했습니다','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user02','오랜만에 보는 국악공연','요즘 국악 공연은 옛날의 그 고리타분한 느낌이 아니더군요 MZ 세대의 국악은 달랐습니다','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','돈키호테를 보고','대단했습니다','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user04','사랑도 리콜이 되나요?','사랑도 리콜이 되나요 ?? 과연 그럴까?','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','비발디의 사계 베르디 악단의 공연을 보고 ','한때 대단한 클래식 광이었던 저.. 바쁜 일상에 치이다 보니..','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','저예산 소극장 공연도 괜찮네요','여기 추천 목록을 보고 충동적으로 표를 끊고 보러 갔는데 기대이상','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user01','지킬앤 하이드','믿고 보는 작품. 믿고 보는 배우. ','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','삶이 그대를 속일지라도','냉담해지지 말고, 지치지도 말고,','5',0,SYSDATE);
INSERT INTO TBL_Review VALUES(SEQ_Rev.NEXTVAL, 'user05','햄릿','투비올 낫투비, 햄릿뿐만이 아닌 우리모두에게도 영원한 숙제로 남을 질문','5',0,SYSDATE);


INSERT INTO TBL_Notice(NoticeNum, NTitile, NContent, NReadCount, NCreateDate)
VALUES(SEQ_Notice.NEXTVAL, '컬쳐쇼크 이용 안내','욕설금지',0,SYSDATE);



commit;
