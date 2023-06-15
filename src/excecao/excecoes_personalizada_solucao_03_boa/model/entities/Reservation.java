package excecao.excecoes_personalizada_solucao_03_boa.model.entities;

import excecao.excecoes_personalizada_solucao_03_boa.model.Exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkin;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Erro dates!");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkIn;
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

    public void updateDate(Date checkin, Date checkOut) {

        Date now = new Date();

        if (checkin.before(now) || checkOut.before(now)) {
            throw new DomainException("Date errors!");
        }

        if (!checkOut.after(checkin)) {
            throw new DomainException("Erro dates!");
        }

        this.checkin = checkin;
        this.checkOut = checkOut;

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
