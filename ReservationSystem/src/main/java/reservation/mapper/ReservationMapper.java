package reservation.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import reservation.dto.ReservationDto;

@Mapper
public interface ReservationMapper {
	
	List<ReservationDto> selectReservationList() throws Exception;
	void insertReservation(ReservationDto reservationDto) throws Exception;
	ReservationDto selectReservationDetail(int reservationIdx) throws Exception;
	ReservationDto updateAvailability() throws Exception;
}
