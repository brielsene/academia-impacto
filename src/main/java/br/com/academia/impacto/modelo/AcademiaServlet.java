package br.com.academia.impacto.modelo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AcademiaServlet
 */
@WebServlet("/academiaServlet")
public class AcademiaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("nome")=="" || request.getParameter("cpf")=="" || request.getParameter("idade")==""
			|| request.getParameter("altura")=="" || request.getParameter("peso")=="")
		{
			RequestDispatcher rd = request.getRequestDispatcher("/falhaAoCadastrar.jsp");
			String msg = "Erro ao Cadastrar, você esqueceu de preencher algum dos campos";
			request.setAttribute("erro", msg);
			rd.forward(request, response);
			
		}else {
			Pessoa pessoa = new Pessoa(request.getParameter("nome"), Integer.parseInt(request.getParameter("cpf")),
					Integer.parseInt(request.getParameter("idade")), Double.parseDouble(request.getParameter("altura")),
					Double.parseDouble(request.getParameter("peso")));
					pessoa.calculaImc(pessoa.getPeso(), pessoa.getAltura());
			RequestDispatcher rd = request.getRequestDispatcher("/cadastradoComSucesso.jsp");
			request.setAttribute("nome", pessoa.getNome());
			request.setAttribute("cpf", pessoa.getCpf());
			request.setAttribute("idade", pessoa.getIdade());
			request.setAttribute("altura", pessoa.getAltura());
			request.setAttribute("peso", pessoa.getPeso());
			request.setAttribute("imc", pessoa.getImc());
			rd.forward(request, response);
		}
	}

}
