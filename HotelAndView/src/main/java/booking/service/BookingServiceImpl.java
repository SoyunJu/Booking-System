package booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import booking.dto.BookingDto;
import booking.mapper.BookingMapper;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired
	private BookingMapper bookingMapper;
	

	@Override
	public List<BookingDto> selectBookingList() throws Exception {
		return bookingMapper.selectBookingList();
	}

	@Override
	public void insertBooking(BookingDto bookingDto) throws Exception {
		bookingMapper.insertBooking(bookingDto);
	}

	@Override
	public BookingDto selectBookingDetail(int bookingIdx) throws Exception {
		return bookingMapper.selectBookingDetail(bookingIdx);
	}

}
