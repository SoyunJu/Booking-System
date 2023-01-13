package reservation.service;

import java.util.List;

import reservation.dto.ReservationDto;

public interface ReservationService {
	public List<ReservationDto> selectReservationList() throws Exception;
	public void insertReservation(ReservationDto reservationDto) throws Exception;
	public ReservationDto selectReservationDetail(int reservationIdx) throws Exception;
	ReservationDto updateAvailability() throws Exception;

}
