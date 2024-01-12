package sec02.exam06;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;


public class ObjectStreamExample {
	public static void main(String[] args) throws Exception {
		writeList();
		List<Board> list=readList();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
		for(Board board:list) {
			System.out.println(
			board.getBno()+"\t"+board.getTitle()+"\t"+
			board.getContet+"\t"+board.getWriter()+"\t"+
					sdf.format(board.getDate())
					);
		}
	}
	
	
	


	public static void writeList() throws Exception{
		List<Board> list=new ArrayList<>();
		
		list.add(new Board(1,"제목1","내용1","글쓴이1",new Date()));
		list.add(new Board(2,"제목2","내용2","글쓴이2",new Date()));
		list.add(new Board(3,"제목3","내용3","글쓴이3",new Date()));
		
		FileOutputStream fos=new FileOutputStream("C:/Temp/board.db");
		
	}
	
	public static List<Board> readList() {
		// TODO Auto-generated method stub
		return null;
	}

}
