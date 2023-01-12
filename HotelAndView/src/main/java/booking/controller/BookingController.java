package booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import booking.dto.BookingDto;
import booking.service.BookingService;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
public class BookingController {
	
	@Autowired 
	private BookingService bookingService;
	
	@RequestMapping("/openBookingList.do")
	
	public ModelAndView openBookingList() throws Exception {
		ModelAndView mv = new ModelAndView("/BookingList");
		
		List<BookingDto> list = bookingService.selectBookingList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping("/bookingHotelAndView.do")
	public String openbooking() throws Exception {
		return "/bookingHotelAndView";
	}
	
	@RequestMapping("openBookingWrite.do")
	public String openBookingWrite() throws Exception {
		return "/bookingWrite";
	}
	
	@RequestMapping("insertBooking.do")
	public String insertBooking(BookingDto bookingDto) throws Exception {
		bookingService.insertBooking(bookingDto);
		return "redirect:/openBookingList.do";
	}
	
	@GetMapping("/openBookingDetail.do")
	public ModelAndView openBookingDetail(@RequestParam int bookingIdx) throws Exception {
		ModelAndView mv = new ModelAndView("/bookingDetail");
		
		BookingDto bookingDto = bookingService.selectBookingDetail(bookingIdx);
		mv.addObject("booking", bookingDto);
		
		return mv;
	}

}
