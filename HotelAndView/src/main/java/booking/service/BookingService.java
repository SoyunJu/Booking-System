package booking.service;

import java.util.List;

import booking.dto.BookingDto;

public interface BookingService {
	public List<BookingDto> selectBookingList() throws Exception;
	public void insertBooking(BookingDto bookingDto) throws Exception;
	public BookingDto selectBookingDetail(int bookingIdx) throws Exception;

}
