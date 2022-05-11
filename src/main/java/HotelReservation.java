public class HotelReservation {
    public String getCheapestHotel (String input) {
    	
    	//mudar nome da variavel x
    	//separa a entrada em um array de strings
    	String[] listaInput = input.split(" ");
    	int diasNormais = 0;
    	int fimDeSemana = 0;
    	
    	//conta os dias normais e fds na entrada
    	for(int i=1; i<listaInput.length; i++) {
    		if(listaInput[i].contains("sat") || listaInput[i].contains("sun")) {
    			fimDeSemana++;
    		}
    		if(listaInput[i].contains("mon") || listaInput[i].contains("tues") || listaInput[i].contains("wed") || listaInput[i].contains("thur") || listaInput[i].contains("fri")) {
    			diasNormais++;
    		}
    	}
    	
    	return getPriceHotel(listaInput[0], diasNormais, fimDeSemana);
    }
    
    private String getPriceHotel(String tipoCliente, int diasNormais, int fimDeSemana) {
    	int lakewood = 0;
    	int bridgewood = 0;
    	int ridgewood = 0;
    	
    	if(tipoCliente.contains("Regular")) {
    		lakewood = 110*diasNormais + 90*fimDeSemana;
    		bridgewood = 160*diasNormais + 60*fimDeSemana;
    		ridgewood = 220*diasNormais + 150*fimDeSemana;
    	}
    	else if(tipoCliente.contains("Reward")) {
    		lakewood = 80*diasNormais + 80*fimDeSemana;
    		bridgewood = 110*diasNormais + 50*fimDeSemana;
    		ridgewood = 100*diasNormais + 40*fimDeSemana;
    	}
    	
    	if(lakewood < bridgewood && lakewood < ridgewood) {
    		return "Lakewood";
    	}
    	else if(bridgewood < lakewood && bridgewood < ridgewood) {
    		return "Bridgewood";
    	}
    	else if(ridgewood < bridgewood && ridgewood < lakewood) {
    		return "Ridgewood";
    	}
    	else if(lakewood == bridgewood && lakewood < ridgewood) {
    		return "Bridgewood";
    	}
    	else if(bridgewood < lakewood && bridgewood == ridgewood) {
    		return "Ridgewood";
    	}
    	else if(ridgewood < bridgewood && ridgewood == lakewood) {
    		return "Ridgewood";
    	}
    	
    	return "";
    }
}
