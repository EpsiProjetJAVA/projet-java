package Model;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Seance  extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        try {
            String myDriver = "org.gjt.mm.mysql.Driver";
            String myUrl = "jdbc:mysql://localhost:3306/Projet_jee";
            Class.forName(myDriver);
            Connection conn = DriverManager.getConnection(myUrl, "root", "");

            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Projet_jee.Seance(id, horraireDebut, horraireFin, date) VALUES (?, ?, ?, ?)");

            int id = Integer.parseInt(request.getParameter("IdSeance"));
            stmt.setInt(1, id);

            Time debut = (Time) sdf.parse(request.getParameter("HorraireDebut"));
            stmt.setTime(2, debut);

            Time fin = (Time) sdf.parse(request.getParameter("HorraireFin"));
            stmt.setTime(3, fin);

            Date date = sdf.parse( request.getParameter("Date"));
            stmt.setDate(4, (java.sql.Date) date);


            stmt.executeUpdate();

            conn.commit();
            conn.close();

        }catch (Exception e){

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private int id;
    private int horraireDebut;
    private int horraireFin;
    private Date date;
}
