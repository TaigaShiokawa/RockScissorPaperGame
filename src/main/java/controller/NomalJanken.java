package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/nomalJanken")
public class NomalJanken extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String view = "/WEB-INF/views/nomalJanken.jsp";
		request.getRequestDispatcher(view).forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String playerHand = request.getParameter("playerHand");

		if (playerHand == null || playerHand.isEmpty()) {
			String view = "/WEB-INF/views/nomalJanken.jsp";
			request.getRequestDispatcher(view).forward(request, response);
		}

		int myHand = Integer.parseInt(playerHand);
		int cpHand = (int) (Math.random() * 3);
		
		setResultAttribute(myHand, cpHand, request);

		String view = "/WEB-INF/views/nomalJankenResult.jsp";
		request.getRequestDispatcher(view).forward(request, response);

	}

	private void setResultAttribute(int myHand, int cpHand, HttpServletRequest request) {
		String[] choices = { "👊", "✌️", "✋" };

		String result;
		int machResult = (myHand - cpHand + 3) % 3; //剰余を求めて勝敗を判定

		switch (machResult) {
			case 0:result = "あいこです";break;
			case 1:result = "コンピュータの勝ちです";break;
			case 2:result = "あなたの勝ちです";break;
			default:result = "結果が不明です";
		}
		
		request.setAttribute("myHand", choices[myHand]);
		request.setAttribute("cpHand", choices[cpHand]);
		request.setAttribute("result", result);
	}
}
