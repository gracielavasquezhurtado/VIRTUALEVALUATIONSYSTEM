package org.apache.jsp.AplicacionExamen.RendirExamen.ExamenSupervisado;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import BEAN.*;
import java.util.ArrayList;

public final class FrmRendirExamenSupervisado_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    
    AlumnoBean  objAlumnoBean=null;
   SemestreBean   objSemestreBean=null;   
    
AyudaBean   objAyudas=null;
ArrayList<DesarrolloExamenGeneradoBean>  listaDesarrolloExamenGeneradoBean    = null;
DesarrolloExamenGeneradoBean   objDesarrolloExamenGeneradoBean;
DetalleEstructuraExamenBean  objDetalleEstructuraExamenBean=null;
ArrayList<AyudaBean>  listaAyudas=null;
ArrayList<AlternativaBean>  listaAlternativa=null;
String contadorcad,enunciado,estadoimagenpreg,rutaimagenpreg,capacidad;
int  contador;
String CODMATRICULA,CODDETAMATRICULA;
String  parametro="",limite,parametros="";
String  RESPUESTAOK;
String  CODDESARROLLOEXAMGENERADOCAD,NUMEXAMDESARROLLOGENERADOCAD;
double   penalidadayuda,penalidaderrorpregunta,puntajepregunta;


 ExamenAutoGeneradoBean  objExamenAutoGeneradoBean=null;




  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


   objAlumnoBean=(AlumnoBean)session.getAttribute("SESION"); 
   objSemestreBean=(SemestreBean)session.getAttribute("SESIONSEMESTRE");
   // parametros="&CODALU="+objAlumnoBean.getCODALU()+"&CODSEMESTRE="+objSemestreBean.getCODSEMESTRE();
 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");


   objAlumnoBean=(AlumnoBean)session.getAttribute("SESION"); 
   objSemestreBean=(SemestreBean)session.getAttribute("SESIONSEMESTRE");
    parametros="&CODALU="+objAlumnoBean.getCODALU()+"&CODSEMESTRE="+objSemestreBean.getCODSEMESTRE();
 

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
	listaDesarrolloExamenGeneradoBean =(ArrayList<DesarrolloExamenGeneradoBean> )session.getAttribute("listaDesarrolloExamenGenerado");
     
        listaAlternativa=(ArrayList<AlternativaBean>)request.getAttribute("Alternativa");
        listaAyudas=(ArrayList<AyudaBean>)request.getAttribute("Ayudas");
	contadorcad=session.getAttribute("contador").toString();      
        contador=Integer.parseInt(contadorcad);
        objDesarrolloExamenGeneradoBean=(DesarrolloExamenGeneradoBean)request.getAttribute("PREGUNTAS");
        enunciado=objDesarrolloExamenGeneradoBean.getENUNCIADOPREG();
        RESPUESTAOK=objDesarrolloExamenGeneradoBean.getRESPUESTAOK();
        limite =request.getAttribute("limite").toString();    

        estadoimagenpreg=objDesarrolloExamenGeneradoBean.getESTADOIMGPREG();
        rutaimagenpreg=objDesarrolloExamenGeneradoBean.getIMAGENPREG();
        capacidad=objDesarrolloExamenGeneradoBean.getCAPACIDAD();
        objExamenAutoGeneradoBean=(ExamenAutoGeneradoBean)request.getAttribute("datosmatricula");  
        parametros="&CODMATRICULA="+objExamenAutoGeneradoBean.getCODMATRICULA()+"&CODDETAMATRI="+objExamenAutoGeneradoBean.getCODDETAMATRI()+"&CODMATERIA="+objExamenAutoGeneradoBean.getCODMATERIA()+"&CODESTRUCEXAMEN="+objExamenAutoGeneradoBean.getCODESTRUCEXAMEN(); 

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>SISTEMA  VIRTUAL DE  EVALUACION EN  LINEA USB</title>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("       <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jsalumno.js\"></script>   \r\n");
      out.write("    \r\n");
      out.write(" <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/bootstrap.min2.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom CSS -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/modern-business.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href=\"");
      out.print(request.getContextPath());
      out.write("/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("     <!-- jQuery -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery_3.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/jquery_3.js\"></script>\r\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\r\n");
      out.write("    <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/bootstrap.min5.js\"></script>\r\n");
      out.write("\r\n");
      out.write("   \r\n");
      out.write("     <link href=\"");
      out.print(request.getContextPath());
      out.write("/css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("     <script src=\"");
      out.print(request.getContextPath());
      out.write("/js/responsiveslides.min.js\"></script>\r\n");
      out.write("   \r\n");
      out.write("     \r\n");
      out.write("     <script>\r\n");
      out.write("         \r\n");
      out.write("       function InvocarMenu(ruta,tabla,op,parametros)\r\n");
      out.write("       { \r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("             \r\n");
      out.write("              var pagina=ruta+\"/\"+tabla+\"Servlet?\"+parametros;  \r\n");
      out.write("              document.form.action=pagina;\r\n");
      out.write("              document.form.method=\"POST\";\r\n");
      out.write("              document.form.op.value=op;\r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("              document.form.submit();\r\n");
      out.write("                \r\n");
      out.write("       } \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("     </script>\r\n");
      out.write("     \r\n");
      out.write(" \r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("   \r\n");
      out.write("     <form name=\"form\">\r\n");
      out.write("        <input type=\"hidden\" name=\"op\">\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"hidden\" name=\"CODALU\" value=\"");
      out.print(objAlumnoBean.getCODALU());
      out.write("\" >\r\n");
      out.write("        \r\n");
      out.write("        <input type=\"hidden\" name=\"CODSEMESTRE\"  value=\"");
      out.print(objSemestreBean.getCODSEMESTRE());
      out.write("\">\r\n");
      out.write("        <input type=\"hidden\" name=\"parametros\"  >\r\n");
      out.write("   <!-- Navigation -->\r\n");
      out.write("  \r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">   \r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("              \r\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("            <div class=\"navbar-header\">\r\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                </button>\r\n");
      out.write("               <div class=\"logo\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/logousb.png\" style=\"width: 100%;height: auto;\" >\r\n");
      out.write("\t\t</div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("              \r\n");
      out.write("                <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                   <li class=\"active\">\r\n");
      out.write("                        <a href=\"index.html\">Inicio</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                                 \r\n");
      out.write("                   \r\n");
      out.write("                    <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/examen1.png\"    >Aplicación Examen <b class=\"caret\"></b></a>\r\n");
      out.write("                         <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:InvocarMenu('");
      out.print(request.getContextPath());
      out.write("','DetalleMatricula',1,'')\">Rendir Evaluaciones</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"portfolio-2-col.html\">Resultados de las Evaluaciones</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                   \r\n");
      out.write("                    \r\n");
      out.write("                     <li class=\"dropdown\">\r\n");
      out.write("                        <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/configuracion.png\"    >Configuracion <b class=\"caret\"></b></a>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:InvocarMenu('");
      out.print(request.getContextPath());
      out.write("','Alumno',24,'");
      out.print("CODALU="+objAlumnoBean.getCODALU()+"&CODSEMESTRE="+objAlumnoBean.getCODSEMESTRE());
      out.write("')\">Actualizar Informacion</a>\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                               \r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                \r\n");
      out.write("                              <a href=\"javascript:InvocarMenu('");
      out.print(request.getContextPath());
      out.write("','Alumno',18,'");
      out.print("usuario="+objAlumnoBean.getUSUARIO()+
                                                                                                                        "&clave="+objAlumnoBean.getCLAVE()+                                                                                                                       
                                                                                                                        "&codAlu="+objAlumnoBean.getCODALU());
      out.write("')\">Cambiar Contraseña</a>   \r\n");
      out.write("                               \r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                       <li >\r\n");
      out.write("                        <a href=\"");
      out.print(request.getContextPath());
      out.write("/CerrarSesion?opciones=2\" ><img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/configuracion.png\"    >Cerrar Sesion </a>\r\n");
      out.write("                       \r\n");
      out.write("                    </li>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                    \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("                        \r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /.navbar-collapse -->\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.container -->\r\n");
      out.write("    </nav> \r\n");
      out.write("                        \r\n");
      out.write("                 <!-- Page Content -->\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Heading/Breadcrumbs -->\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"col-lg-12\">\r\n");
      out.write("                <h1 class=\"page-header\">\r\n");
      out.write("                    <small>.</small>\r\n");
      out.write("                </h1>\r\n");
      out.write("                               \r\n");
      out.write("            </div>\r\n");
      out.write("             \r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write(" \r\n");
      out.write("                        <div class=\"alert alert-info\">\r\n");
      out.write("                            <h4><strong><center>EXAMEN   DE ENTRENAMIENTO</center></strong></h4>                            \r\n");
      out.write("                        </div>                            \r\n");
      out.write("              \r\n");
      out.write("     <center> \r\n");
      out.write("   \r\n");
      out.write("       <div class=\"panel panel-primary\">\r\n");
      out.write("                \r\n");
      out.write("            \r\n");
      out.write("                                <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"0%\">                        \r\n");
      out.write("                                    <tbody>                  \r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                                <td   class=\"col-md-2\"   >\r\n");
      out.write("                                                    <b> Tiempo Restante :</b>\r\n");
      out.write("                                                </td>\r\n");
      out.write("\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                   <div  >                                                        \r\n");
      out.write("                                                       <p class=\"text-justify\"><span id=\"minutos\">80:00  Min  </span>  </p>    \r\n");
      out.write("                                                   </div>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                        </tr>  \r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                                <td   class=\"col-md-2\"   >\r\n");
      out.write("                                                    <b> Puntaje :</b>\r\n");
      out.write("                                                </td>\r\n");
      out.write("\r\n");
      out.write("                                                <td>\r\n");
      out.write("                                                   <div  >                                                        \r\n");
      out.write("                                                       <p class=\"text-justify\"><span id=\"minutos\">3 Puntos</span>  </p>    \r\n");
      out.write("                                                   </div>\r\n");
      out.write("                                                </td>\r\n");
      out.write("                                        </tr>  \r\n");
      out.write("                                     </tbody>  \r\n");
      out.write("                                </table>                  \r\n");
      out.write("                   \r\n");
      out.write("           </div> \r\n");
      out.write("             \r\n");
      out.write("          <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\"> Pregunta</h3>\r\n");
      out.write("                </div>             \r\n");
      out.write("                  \r\n");
      out.write("                 ");
 if(estadoimagenpreg.equals("I")) {  
      out.write("\r\n");
      out.write("         \r\n");
      out.write("                  <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"100%\">                        \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td  class=\"col-md-1\"  >");
      out.print(contador);
      out.write(")</td>\r\n");
      out.write("                                <td   >\r\n");
      out.write("                                  <div  style=\"FONT-FAMILY: Tahoma;BACKGROUND-COLOR:white;FONT-SIZE: 10pt;COLOR: black;height:auto\">           \r\n");
      out.write("                                         <p class=\"text-justify\">");
      out.print(enunciado);
      out.write("</p>                   \r\n");
      out.write("                                  </div> \r\n");
      out.write("                                    \r\n");
      out.write("                                </td>                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>  \r\n");
      out.write("                    </table> \r\n");
      out.write("         \r\n");
      out.write("         \r\n");
      out.write("                 ");
  } else{  
      out.write("\r\n");
      out.write("\r\n");
      out.write("                   <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"100%\">                        \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td class=\"col-md-1\" >");
      out.print(contador);
      out.write(")</td>\r\n");
      out.write("                                <td   >\r\n");
      out.write("                                  <div  style=\"FONT-FAMILY: Tahoma;BACKGROUND-COLOR:white;FONT-SIZE: 10pt;COLOR: black;height:auto\">           \r\n");
      out.write("                                         <p class=\"text-justify\">");
      out.print(enunciado);
      out.write("</p>                   \r\n");
      out.write("                                  </div> \r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>                            \r\n");
      out.write("                              <tr>\r\n");
      out.write("                                  <td class=\"col-md-1\" ></td>\r\n");
      out.write("                                  <td >\r\n");
      out.write("                                    <div class=\"logo\"    >\r\n");
      out.write("                                        <center>\r\n");
      out.write("                                            <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/header-bg4.png\" style=\"width: 100%;height:60%;\" >\r\n");
      out.write("                                        </center> \r\n");
      out.write("\t\t                    </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </tbody>  \r\n");
      out.write("                    </table> \r\n");
      out.write("\r\n");
      out.write("                 ");
 }  
      out.write("\r\n");
      out.write("              \r\n");
      out.write("                       \r\n");
      out.write("     ");
  if(capacidad.equals("CONCEPTUAL")){ 
      out.write("         \r\n");
      out.write("               <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">Alternativas</h3>\r\n");
      out.write("                </div> \r\n");
      out.write("                       \r\n");
      out.write("               \r\n");
      out.write("                    <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"0%\">                        \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                    ");
  for(AlternativaBean  objAlternativas:listaAlternativa){  
      out.write("\r\n");
      out.write("                            <tr   >\r\n");
      out.write("                                <td   class=\"col-md-1\"   >");
      out.print(objAlternativas.getCLAVEALTER());
      out.write("<b>)</b>&nbsp;&nbsp;&nbsp;<input type=\"radio\" name=\"rdop\" id=\"rdop\" value=\"");
      out.print(objAlternativas.getCLAVEALTER());
      out.write("\"></td>\r\n");
      out.write("                                \r\n");
      out.write("                                <td>\r\n");
      out.write("                                                       <div style=\"FONT-FAMILY: Tahoma;FONT-SIZE: 10pt;COLOR: black;\" >                                                        \r\n");
      out.write("                                                           <p class=\"text-justify\">");
      out.print(objAlternativas.getENUNCIADOALTER());
      out.write("</p>    \r\n");
      out.write("                                                        </div>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                              ");
   }
      out.write("\r\n");
      out.write("                             \r\n");
      out.write("                        </tbody>  \r\n");
      out.write("                    </table>                  \r\n");
      out.write("            \r\n");
      out.write("                   </div>\r\n");
      out.write("                            \r\n");
      out.write("        ");
  }else{ 
      out.write("\r\n");
      out.write("                  <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">Digite su Respuesta o Adjunte archivo con  formato ZIP</h3>\r\n");
      out.write("                </div> \r\n");
      out.write("                    <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"0%\">                        \r\n");
      out.write("                        <tbody>                    \r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <center>\r\n");
      out.write("                                            <textarea       style=\"width: 100%;height:200px;\"></textarea> \r\n");
      out.write("                                    </center>\r\n");
      out.write("                                </td>                     \r\n");
      out.write("                            </tr>\r\n");
      out.write("                             <tr>\r\n");
      out.write("                                 <td> \r\n");
      out.write("                                     <center>\r\n");
      out.write("                                           <button   class=\"btn btn-primary\"   onclick=\"\"> <img src=\"");
      out.print(request.getContextPath());
      out.write("/imagenes/subirimagen.png\" width=\"40px\" height=\"35px\"><br>Subir archivo</button> \r\n");
      out.write("                                    </center> \r\n");
      out.write("                                   \r\n");
      out.write("                                     \r\n");
      out.write("                                 </td>                     \r\n");
      out.write("                            </tr>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                        </tbody>  \r\n");
      out.write("                    </table>                  \r\n");
      out.write("            \r\n");
      out.write("                   </div>   \r\n");
      out.write("         ");
  }  
      out.write("\r\n");
      out.write("                               <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"0%\">                        \r\n");
      out.write("                               <tbody>\r\n");
      out.write("                              <input type=\"button\"    class=\"btn btn-primary\"  value=\"Siguiente Pregunta ==>\" onclick=\"siguientepreguntaalumno('");
      out.print(request.getContextPath());
      out.write("','ExamenAutoGenerado',4,'");
      out.print(limite);
      out.write("','");
      out.print(parametros);
      out.write("')\"   >\r\n");
      out.write("                              </tbody>\r\n");
      out.write("                               </table>\r\n");
      out.write("                              <br>\r\n");
      out.write("                <div class=\"panel panel-primary\">\r\n");
      out.write("                <div class=\"panel-heading\">\r\n");
      out.write("                    <h3 class=\"panel-title\">Ayudas</h3>\r\n");
      out.write("                </div> \r\n");
      out.write("                       \r\n");
      out.write("              \r\n");
      out.write("                    <table id=\"example\" class=\"table table-striped table-bordered dt-responsive nowrap\" cellspacing=\"0\" width=\"0%\">                        \r\n");
      out.write("                        <tbody>\r\n");
      out.write("                    ");
    int   i1=1; 
                          for(AyudaBean  objAyudas:listaAyudas){ 
                            parametro="&enunciado="+objAyudas.getENUNCIADOAYUDA();    
      out.write("\r\n");
      out.write("                            <tr   >\r\n");
      out.write("                                <td class=\"col-md-1\"   >\r\n");
      out.write("                                    \r\n");
      out.write("                                    \r\n");
      out.write("                                    <input type=\"button\"    class=\"btn btn-primary\"  value=\"Ayuda # ");
      out.print(""+i1 );
      out.write(":\" id=\"");
      out.print("B"+i1);
      out.write("\" onclick=\"Ayuda('");
      out.print(request.getContextPath());
      out.write("','ExamenAutoGenerado',6,'");
      out.print(parametro);
      out.write("','ayuda");
      out.print("A"+i1);
      out.write("','");
      out.print("B"+i1);
      out.write("','");
      out.print(penalidadayuda);
      out.write("')\"   >\r\n");
      out.write("                                \r\n");
      out.write("                                \r\n");
      out.write("                                <td >\r\n");
      out.write("                                      <div  id=\"ayuda");
      out.print("A"+i1);
      out.write("\"  style=\"visibility: visible;display:block;height:100px;FONT-FAMILY: Tahoma;BACKGROUND-COLOR:DarkGray;FONT-SIZE: 10pt;COLOR: black;overflow: scroll\">           \r\n");
      out.write("                                                            \r\n");
      out.write("                                         </div>    \r\n");
      out.write("                                </td>\r\n");
      out.write("                                \r\n");
      out.write("                            </tr>\r\n");
      out.write("                            \r\n");
      out.write("                              ");
  i1++;  }
      out.write("\r\n");
      out.write("                             \r\n");
      out.write("                        </tbody>  \r\n");
      out.write("                    </table>                  \r\n");
      out.write("          \r\n");
      out.write("                   </div>        \r\n");
      out.write("                   \r\n");
      out.write("              </div>\r\n");
      out.write("          </div>                 \r\n");
      out.write("\t\t</center>\r\n");
      out.write("                              <!-- Page Content -->\r\n");
      out.write("    <div class=\"container\"> \r\n");
      out.write("\r\n");
      out.write("        <hr>\r\n");
      out.write("\r\n");
      out.write("        <!-- Footer -->\r\n");
      out.write("       <footer>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-lg-12\">\r\n");
      out.write("                    <p>Sistema Virtual de  Evaluacion en Linea de la Universidad Peruana  Simon Bolivar  &copy; 2015</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
