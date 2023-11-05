package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/multiJanken")
public class MultiJanken extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		String view = "/WEB-INF/views/multiJanken.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String playerHand = request.getParameter("playerHand");
		
		if(playerHand == null || playerHand.isEmpty()) {
			String view = "/WEB-INF/views/multiJanken.jsp";
			request.getRequestDispatcher(view).forward(request, response);
		}
		
		int myHand = Integer.parseInt(playerHand);
		int cpHand1 = (int)(Math.random() * 3);
		int cpHand2 = (int)(Math.random() * 3);
		
		ResultAttribute(myHand, cpHand1, cpHand2, request);
		setHandAttribute(myHand, "myHand", request);
		setHandAttribute(cpHand1, "pcHand1", request);
	    setHandAttribute(cpHand2, "pcHand2", request);
		
		String view = "/WEB-INF/views/multiJankenResult.jsp";
		request.getRequestDispatcher(view).forward(request, response);
	}
	
	private void setHandAttribute(int myHand, String handAttribute, HttpServletRequest request) {
		String[] choices = {"👊", "✌️", "✋️"};
		
		request.setAttribute(handAttribute, choices[myHand]);
	}
	
	private void ResultAttribute(int myHand, int cpHand1, int cpHand2, HttpServletRequest request) {
        String result = judge(myHand, cpHand1, cpHand2);
        request.setAttribute("result", result);
    }

    private String judge(int myHand, int cpHand1, int cpHand2) {
        String result;
        
        if(myHand == 0 && cpHand1 == 0 && cpHand2 ==1) {
            result = "あなたとコンピュータ1の勝ちです";
        } else if(myHand == 0 && cpHand1 == 0 && cpHand2 ==2) {
            result = "コンピュータ2の勝ちです";
        } else if(myHand == 0 && cpHand1 == 1 && cpHand2 == 0) {
            result = "あなたとコンピュータ2の勝ちです";
        } else if(myHand == 0 && cpHand1 == 1 && cpHand2 == 1) {
            result = "あなたの勝ちです";
        } else if(myHand == 0 && cpHand1 == 2 && cpHand2 == 0) {
            result = "コンピュータ1の勝ちです";
        } else if(myHand == 0 && cpHand1 == 2 && cpHand2 == 2) {
            result = "コンピュータ1とコンピュータ2の勝ちです";
        } else if(myHand == 1 && cpHand1 == 0 && cpHand2 ==0) {
            result = "コンピュータ1とコンピュータ2の勝ちです";
        } else if(myHand == 1 && cpHand1 == 0 && cpHand2 ==1) {
            result = "コンピュータ1の勝ちです";
        } else if(myHand == 1 && cpHand1 == 1 && cpHand2 == 0) {
            result = "コンピュータ2の勝ちです";
        } else if(myHand == 1 && cpHand1 == 1 && cpHand2 == 2) {
            result = "あなたとコンピュータ1の勝ちです";
        } else if(myHand == 1 && cpHand1 == 2 && cpHand2 == 1) {
            result = "あなたとコンピュータ2の勝ちです";
        } else if(myHand == 1 && cpHand1 == 2 && cpHand2 == 2) {
            result = "あなたの勝ちです";
        } else if(myHand == 2 && cpHand1 == 0 && cpHand2 ==0) {
            result = "あなたの勝ちです";
        } else if(myHand == 2 && cpHand1 == 0 && cpHand2 ==2) {
            result = "あなたとコンピュータ2の勝ちです";
        } else if(myHand == 2 && cpHand1 == 1 && cpHand2 == 1) {
            result = "コンピュータ1とコンピュータ2の勝ちです";
        } else if(myHand == 2 && cpHand1 == 1 && cpHand2 == 2) {
            result = "コンピュータ1の勝ちです";
        } else if(myHand == 2 && cpHand1 == 2 && cpHand2 == 0) {
            result = "あなたとコンピュータ1の勝ちです";
        } else if(myHand == 2 && cpHand1 == 2 && cpHand2 == 1) {
            result = "コンピュータ2の勝ちです";
        } else {
            result = "あいこでっす";
        }
        return result;
    }

}
