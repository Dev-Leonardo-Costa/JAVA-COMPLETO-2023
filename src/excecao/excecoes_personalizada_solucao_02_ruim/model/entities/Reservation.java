package excecao.excecoes_personalizada_solucao_02_ruim.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkin, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckin() {
        return checkin;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {
        long diff = checkOut.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDate(Date checkin, Date checkOut) {

        Date now = new Date();

        if (checkin.before(now) || checkOut.before(now)) {
            return "Date errors!";
        }

        if (!checkOut.after(checkin)) {
            return "Erro dates!";
        }

        this.checkin = checkin;
        this.checkOut = checkOut;
        return null;
    }

    @Override
    public String toString() {
        return "Room: " +
                roomNumber +
                ", Check-in: " +
                sdf.format(checkin) +
                ", Check-out: " + sdf.format(checkOut)
                + ", " + duration() + " nights";

    }

}
