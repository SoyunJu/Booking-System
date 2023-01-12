package booking.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import booking.dto.BookingDto;

@Mapper
public interface BookingMapper {
	
	List<BookingDto> selectBookingList() throws Exception;
	void insertBooking(BookingDto bookingDto) throws Exception;
	BookingDto selectBookingDetail(int bookingIdx) throws Exception;

}
