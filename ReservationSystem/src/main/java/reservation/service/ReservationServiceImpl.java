package reservation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reservation.dto.ReservationDto;
import reservation.mapper.ReservationMapper;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationMapper reservationMapper;
	

	@Override
	public List<ReservationDto> selectReservationList() throws Exception {
		return reservationMapper.selectReservationList();
	}

	@Override
	public void insertReservation(ReservationDto reservationDto) throws Exception {
		reservationMapper.insertReservation(reservationDto);
	}

	@Override
	public ReservationDto selectReservationDetail(int reservationIdx) throws Exception {
		return reservationMapper.selectReservationDetail(reservationIdx);
	}

	@Override
	public ReservationDto updateAvailability() throws Exception {
		return null;
	}

}
