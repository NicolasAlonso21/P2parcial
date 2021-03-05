import java.util.ArrayList;
import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		ArrayList <Desarrollador> desarrolladores = new ArrayList<Desarrollador>();
		ArrayList <Proyecto> proyectos = new ArrayList<Proyecto>();
		ArrayList <Asignacion> asignaciones = new ArrayList<Asignacion>();
		String nombre="", direccion="", habilidades="", di="", telefono="", opc="", nombreP="", codigoP="", descripcionP="", documentoA="", codigoA, responsabilidad="";
		int vc=0, horas=0;
		float presupuestoP=0f, duracionP=0f;
		while(opc.equals("13")==false) {
			opc=JOptionPane.showInputDialog("***Menu***\n1.Adicionar los datos de un nuevo desarrollador. Los datos son: nombre, documento de identidad, habilidades, direccion y telefono."
                    +"\n2.Consultar los datos de un desarrollador buscandolo por su documento de identidad."
                    +"\n3.Modificar los datos de un desarrollador, buscandolo por su documento de identidad y modificando los otros datos.\n4.eliminar los datos de un desarrollador buscandolo por documento de identidad."+
                    "\n5.Adicionar los datos de un nuevo proyecto, los datos del proyecto son: código, nombres, descripción, duración y presupuesto."+"\n6.Consultar los datos de un proyecto, buscándolo por el código"+
                    "\n7.Modificar  los datos de un proyecto, buscándolo por el código."+"\n8.Eliminar los datos de un proyecto, buscándolo por su código."+
                    "\n9. Adicionar una asignación de un desarrollador a un proyecto. Código del proyecto, documento de identidad del desarrollador,responsabilidad, dedicación en horas diarias."+
                    "\n10. Consultar la asignación de un desarrollador a un proyecto, se busca por el código del proyecto y el número de documento del desarrollador."+
                    "\n11.Modificar  la asignación de un desarrollador a un proyecto, se busca por el código del proyecto y el número de documento del desarrollador."+
                    "\n12.Eliminar una asignación"+"\n13.Salir");
			if(opc.equals("1")==true){
				nombre=JOptionPane.showInputDialog("Ingrese el nombre del desarrollador:");
				di=JOptionPane.showInputDialog("Ingrese el documento del desarrollador:");
				habilidades=JOptionPane.showInputDialog("Ingrese las habilidades del desarrollador:");
				direccion=JOptionPane.showInputDialog("Ingrese la dirección del desarrollador:");
				telefono=JOptionPane.showInputDialog("Ingrese el telefono del desarrollador:");
				Desarrollador D1 = new Desarrollador();
				D1.setNombre(nombre);
				D1.setDireccion(direccion);
				D1.setHabilidades(habilidades);
				D1.setDI(di);
				D1.setTelefono(telefono);
				desarrolladores.add(D1);
			}else if(opc.equals("2")==true){
				String di_buscar=JOptionPane.showInputDialog("Documento:");	
				for(vc=0;vc<desarrolladores.size();vc++){
				if(desarrolladores.get(vc).getDI().equals(di_buscar)){
						JOptionPane.showMessageDialog(null,"Los datos del desarrollador son:\n"+"Nombre:"+desarrolladores.get(vc).getNombre()+
                                                     "\nDirección:"+desarrolladores.get(vc).getDireccion()+"\nHabilidades:"+desarrolladores.get(vc).getHabilidades()+"\nDocumento:"+
                                                     desarrolladores.get(vc).getDI()+"\nTelefono:"+desarrolladores.get(vc).getTelefono());
					}
				}	
			}else if(opc.equals("3")==true){
				String di_buscar=JOptionPane.showInputDialog("Documento:");
				for(vc=0;vc<desarrolladores.size();vc++){
					if(desarrolladores.get(vc).getDI().equals(di_buscar)){
						nombre=JOptionPane.showInputDialog("Ingrese el nombre del desarrollador modificado:");
						habilidades=JOptionPane.showInputDialog("Ingrese las habilidades del desarrollador modificado:");
						direccion=JOptionPane.showInputDialog("Ingrese la dirección del desarrollador modificado:");
						telefono=JOptionPane.showInputDialog("Ingrese el telefono del desarrollador modificado:");
						desarrolladores.get(vc).setNombre(nombre);
						desarrolladores.get(vc).setHabilidades(habilidades);
						desarrolladores.get(vc).setDireccion(direccion);
						desarrolladores.get(vc).setTelefono(telefono);
					}
				}	
			}else if(opc.equals("4")==true){
				String di_buscar=JOptionPane.showInputDialog("Documento:");
				for(vc=0;vc<desarrolladores.size();vc++){
					if(desarrolladores.get(vc).getDI().equals(di_buscar)){
						desarrolladores.remove(vc);
					}
				}	
			}else if(opc.equals("5")==true){
				nombreP=JOptionPane.showInputDialog("Ingrese el nombre del proyecto:");
				codigoP=JOptionPane.showInputDialog("Ingrese el codigo del proyecto:");
				descripcionP=JOptionPane.showInputDialog("Ingrese la descripción del proyecto:");
				presupuestoP=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto:"));
				duracionP=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la duración del proyecto en dias:"));
				Proyecto P1 = new Proyecto();
				P1.setNombre(nombreP);
				P1.setCodigo(codigoP);
				P1.setDescripcion(JOptionPane.showInputDialog("Ingrese la descripcion:"));
				P1.setPresupuesto(presupuestoP);
				P1.setDuracion(duracionP);
				proyectos.add(P1);
			}else if(opc.equals("6")==true){
				String codigo_buscar=JOptionPane.showInputDialog("Codigo:");
				for(vc=0;vc<proyectos.size();vc++){
					if(proyectos.get(vc).getCodigo().equals(codigo_buscar)){
						JOptionPane.showMessageDialog(null,"Los datos del proyecto son:\n"+"Nombre:"+proyectos.get(vc).getNombre()+
                                "\nCodigo:"+proyectos.get(vc).getCodigo()+"\nDescripcion:"+proyectos.get(vc).getDescripcion()+"\nPresupuesto:"+
                                proyectos.get(vc).getPresupuesto()+"\nDuración:"+proyectos.get(vc).getDuracion());
					}
				}
			}else if(opc.equals("7")==true){
				String codigo_buscar=JOptionPane.showInputDialog("Codigo:");
				for(vc=0;vc<proyectos.size();vc++){
					if(proyectos.get(vc).getCodigo().equals(codigo_buscar)){
						nombreP=JOptionPane.showInputDialog("Ingrese el nombre del proyecto modificado:");
						habilidades=JOptionPane.showInputDialog("Ingrese la descripción del proyecto modficado:");
						presupuestoP=Float.parseFloat(JOptionPane.showInputDialog("Ingrese el presupuesto del proyecto modificado:"));
						duracionP=Float.parseFloat(JOptionPane.showInputDialog("Ingrese la duración del proyecto en dias modificado:"));
						proyectos.get(vc).setNombre(nombreP);
						proyectos.get(vc).setCodigo(codigoP);
						proyectos.get(vc).setDescripcion(JOptionPane.showInputDialog("Ingrese la descripcion:"));
						proyectos.get(vc).setPresupuesto(presupuestoP);
						proyectos.get(vc).setDuracion(duracionP);
						}
				}
			}else if(opc.equals("8")==true){
				String codigo_buscar=JOptionPane.showInputDialog("Codigo:");
				for(vc=0;vc<proyectos.size();vc++){
					if(proyectos.get(vc).getCodigo().equals(codigo_buscar)){
						proyectos.remove(vc);
					}
				}
			}else if(opc.equals("9")==true){
				documentoA=JOptionPane.showInputDialog("Ingrese el documento del desarrollador que desea asignar:");
				codigoA=JOptionPane.showInputDialog("Ingrese el codigo del proyecto que desea asignar :");
				responsabilidad=JOptionPane.showInputDialog("Ingrese la responsabilidad que va a tener el desarrollador en el proyecto:");
				horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas diarias:"));
				Asignacion A1 = new Asignacion();
				A1.setDocumento(documentoA);
				A1.setDI(codigoA);
				A1.setResponsabilidad(responsabilidad);
				A1.setHorasdiarias(horas);
				asignaciones.add(A1);
			}else if(opc.equals("10")==true){
				String documemtoA_busca=JOptionPane.showInputDialog("Documento del desarrollador:");
				String codigoA_buscar=JOptionPane.showInputDialog("Codigo del proyecto:");	
				for(vc=0;vc<asignaciones.size();vc++){
					if(asignaciones.get(vc).getDocumento().equals(documemtoA_busca) && asignaciones.get(vc).getDI().equals(codigoA_buscar)){
						JOptionPane.showMessageDialog(null,"Los datos de la asignacion son:\n"+"Responsabilidad:"+asignaciones.get(vc).getResponsabilidad()+
                                "\nHoras:"+asignaciones.get(vc).getHorasdiarias());
					}
				}
			}else if(opc.equals("11")==true){
				String documemtoA_busca=JOptionPane.showInputDialog("Documento del desarrollador:");
				String codigoA_buscar=JOptionPane.showInputDialog("Codigo del proyecto:");	
				for(vc=0;vc<asignaciones.size();vc++){
					if(asignaciones.get(vc).getDocumento().equals(documemtoA_busca) && asignaciones.get(vc).getDI().equals(codigoA_buscar)){
						responsabilidad=JOptionPane.showInputDialog("Ingrese la nueva responsabilidad que va a tener el desarrollador en el proyecto:");
						horas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas diarias modificadas:"));
						asignaciones.get(vc).setResponsabilidad(responsabilidad);
						asignaciones.get(vc).setHorasdiarias(horas);
					}
				}
			}else if(opc.equals("12")==true){
				String documemtoA_busca=JOptionPane.showInputDialog("Documento del desarrollador:");
				String codigoA_buscar=JOptionPane.showInputDialog("Codigo del proyecto:");
				for(vc=0;vc<asignaciones.size();vc++){
					if(asignaciones.get(vc).getDocumento().equals(documemtoA_busca) && asignaciones.get(vc).getDI().equals(codigoA_buscar)){
						asignaciones.remove(vc);
					}
				}
			}
		}
	}
}
