package interfaceservico;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import model.Temperatura;

public interface IServicoMonitorTemp extends Remote {
	
	public Temperatura getUltimaTemperaturasLocal(String local) throws RemoteException;
	public Temperatura salvarTemperaturas(Temperatura temperatura) throws RemoteException;
	public Object getTodasTemperaturasLocal(String local) throws RemoteException;
	public Object getTodasTemperaturasLocalPorData(String local, Date inicio, Date fim) throws RemoteException;
	public Object getLocaisCadastrador() throws RemoteException;
	public boolean deleteTemp(Integer id) throws RemoteException;
}
