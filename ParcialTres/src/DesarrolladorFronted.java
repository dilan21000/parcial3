
public class DesarrolladorFronted extends Empleados {

	private int aniosExperienciaBootstrap;
	private boolean expereinciaClound;
	private void AUMENTO_VARIABLE() {
		
		
	}
	public DesarrolladorFronted(String nombre, String apellidos, String direccion, int dni, double salario, char sexo,
			int aniosExperienciaBootstrap, boolean expereinciaClound) {
		super(nombre, apellidos, direccion, dni, salario, sexo);
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
		this.expereinciaClound = expereinciaClound;
	}
	public int getAniosExperienciaBootstrap() {
		return aniosExperienciaBootstrap;
	}
	public void setAniosExperienciaBootstrap(int aniosExperienciaBootstrap) {
		this.aniosExperienciaBootstrap = aniosExperienciaBootstrap;
	}
	public boolean isExpereinciaClound() {
		return expereinciaClound;
	}
	public void setExpereinciaClound(boolean expereinciaClound) {
		this.expereinciaClound = expereinciaClound;
	}
	
	
}
