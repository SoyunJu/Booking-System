package reservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;
import reservation.dto.ReservationDto;
import reservation.service.ReservationService;


@Slf4j
@Controller
public class reservationController {
	
	@Autowired 
	private ReservationService reservationService;
	
	@RequestMapping("/openReservationList.do")
	
	public ModelAndView openReservationList() throws Exception {
		ModelAndView mv = new ModelAndView("/ReservationList");
		
		List<ReservationDto> list = reservationService.selectReservationList();
		mv.addObject("list", list);
		
		return mv;
	}
	
	@RequestMapping("/reservationHotelAndView.do")
	public String openreservation() throws Exception {
		return "/reservationHotelAndView";
	}
	
	@RequestMapping("openReservationWrite.do")
	public String openReservationWrite() throws Exception {
		return "/reservationWrite";
	}
	
	@RequestMapping("insertReservation.do")
	public String insertReservation(ReservationDto reservationDto) throws Exception {
		reservationService.insertReservation(reservationDto);
		return "redirect:/openReservationList.do";
	}
	
	@GetMapping("/openReservationDetail.do")
	public ModelAndView openReservationDetail(@RequestParam int reservationIdx) throws Exception {
		ModelAndView mv = new ModelAndView("/reservationDetail");
		
		ReservationDto reservationDto = reservationService.selectReservationDetail(reservationIdx);
		mv.addObject("reservation", reservationDto);
		
		return mv;
	}

}
