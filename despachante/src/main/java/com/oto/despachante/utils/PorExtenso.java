package com.oto.despachante.utils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author DiegoVerly
 */
public class PorExtenso {

    private Map<Integer, String> valores = new HashMap<Integer, String>();

    public PorExtenso() {

        carregaValores();

    }

    public String getExtenso(String argumentoValor) {
        try {
            String argumento = argumentoValor.replace(',', '.');
            String[] auxiliar = argumento.split("\\.");

            String centavos = verificaCentavos(auxiliar);
            String extenso = escreverExtenso(auxiliar[0]);

            if (centavos.equals(null) || centavos.equals("")) {

                return "###"+extenso.substring(0, 1).toUpperCase()+extenso.substring(1).toLowerCase()+"###";

            } else {

                if (extenso.equals(null) || extenso.equals("")) {

                    return "###"+centavos.substring(0, 1).toUpperCase()+centavos.substring(1).toLowerCase()+"###";

                } else {
                    return "###"+extenso.substring(0, 1).toUpperCase()+extenso.substring(1).toLowerCase() + " e " + centavos+"###";
                }

            }
        } catch (Exception e) {

            return "Erro ao gerar o valor por extenso. Verificar Se o número inserido \n"
                    + "Atende ao padrão: 9999999.99 (Apenas números com 2 casas decimais \n"
                    + " e máximo de 7 dígitos na parte inteira.). "+"Erro: "+e.getMessage();
        }

    }

    private void carregaValores() {

        valores.put(1, "um");
        valores.put(2, "dois");
        valores.put(3, "três");
        valores.put(4, "quatro");
        valores.put(5, "cinco");
        valores.put(6, "seis");
        valores.put(7, "sete");
        valores.put(8, "oito");
        valores.put(9, "nove");
        valores.put(10, "dez");
        valores.put(11, "onze");
        valores.put(12, "doze");
        valores.put(13, "treze");
        valores.put(14, "quatorze");
        valores.put(15, "quinze");
        valores.put(16, "dezesseis");
        valores.put(17, "dezessete");
        valores.put(18, "dezoito");
        valores.put(19, "dezenove");
        valores.put(20, "vinte");
        valores.put(21, "vinte e um");
        valores.put(22, "vinte e dois");
        valores.put(23, "vinte e três");
        valores.put(24, "vinte e quatro");
        valores.put(25, "vinte e cinco");
        valores.put(26, "vinte e seis");
        valores.put(27, "vinte e sete");
        valores.put(28, "vinte e oito");
        valores.put(29, "vinte e nove");
        valores.put(30, "trinta");
        valores.put(31, "trinta e um");
        valores.put(32, "trinta e dois");
        valores.put(33, "trinta e três");
        valores.put(34, "trinta e quatro");
        valores.put(35, "trinta e cinco");
        valores.put(36, "trinta e seis");
        valores.put(37, "trinta e sete");
        valores.put(38, "trinta e oito");
        valores.put(39, "trinta e nove");
        valores.put(40, "quarenta");
        valores.put(41, "quarenta e um");
        valores.put(42, "quarenta e dois");
        valores.put(43, "quarenta e três");
        valores.put(44, "quarenta e quatro");
        valores.put(45, "quarenta e cinco");
        valores.put(46, "quarenta e seis");
        valores.put(47, "quarenta e sete");
        valores.put(48, "quarenta e oito");
        valores.put(49, "quarenta e nove");
        valores.put(50, "cinquenta");
        valores.put(51, "cinquenta e um");
        valores.put(52, "cinquenta e dois");
        valores.put(53, "cinquenta e três");
        valores.put(54, "cinquenta e quatro");
        valores.put(55, "cinquenta e cinco");
        valores.put(56, "cinquenta e seis");
        valores.put(57, "cinquenta e sete");
        valores.put(58, "cinquenta e oito");
        valores.put(59, "cinquenta e nove");
        valores.put(60, "sessenta");
        valores.put(61, "sessenta e um");
        valores.put(62, "sessenta e dois");
        valores.put(63, "sessenta e três");
        valores.put(64, "sessenta e quatro");
        valores.put(65, "sessenta e cinco");
        valores.put(66, "sessenta e seis");
        valores.put(67, "sessenta e sete");
        valores.put(68, "sessenta e oito");
        valores.put(69, "sessenta e nove");
        valores.put(70, "setenta");
        valores.put(71, "setenta e um");
        valores.put(72, "setenta e dois");
        valores.put(73, "setenta e três");
        valores.put(74, "setenta e quatro");
        valores.put(75, "setenta e cinco");
        valores.put(76, "setenta e seis");
        valores.put(77, "setenta e sete");
        valores.put(78, "setenta e oito");
        valores.put(79, "setenta e nove");
        valores.put(80, "oitenta");
        valores.put(81, "oitenta e um");
        valores.put(82, "oitenta e dois");
        valores.put(83, "oitenta e três");
        valores.put(84, "oitenta e quatro");
        valores.put(85, "oitenta e cinco");
        valores.put(86, "oitenta e seis");
        valores.put(87, "oitenta e sete");
        valores.put(88, "oitenta e oito");
        valores.put(89, "oitenta e nove");
        valores.put(90, "noventa");
        valores.put(91, "noventa e um");
        valores.put(92, "noventa e dois");
        valores.put(93, "noventa e três");
        valores.put(94, "noventa e quatro");
        valores.put(95, "noventa e cinco");
        valores.put(96, "noventa e seis");
        valores.put(97, "noventa e sete");
        valores.put(98, "noventa e oito");
        valores.put(99, "noventa e nove");
        valores.put(100, "cem");
        valores.put(101, "cento e um");
        valores.put(102, "cento e dois");
        valores.put(103, "cento e três");
        valores.put(104, "cento e quatro");
        valores.put(105, "cento e cinco");
        valores.put(106, "cento e seis");
        valores.put(107, "cento e sete");
        valores.put(108, "cento e oito");
        valores.put(109, "cento e nove");
        valores.put(110, "cento e dez");
        valores.put(111, "cento e onze");
        valores.put(112, "cento e doze");
        valores.put(113, "cento e treze");
        valores.put(114, "cento e quatorze");
        valores.put(115, "cento e quinze");
        valores.put(116, "cento e dezesseis");
        valores.put(117, "cento e dezessete");
        valores.put(118, "cento e dezoito");
        valores.put(119, "cento e dezenove");
        valores.put(120, "cento e vinte");
        valores.put(121, "cento e vinte e um");
        valores.put(122, "cento e vinte e dois");
        valores.put(123, "cento e vinte e três");
        valores.put(124, "cento e vinte e quatro");
        valores.put(125, "cento e vinte e cinco");
        valores.put(126, "cento e vinte e seis");
        valores.put(127, "cento e vinte e sete");
        valores.put(128, "cento e vinte e oito");
        valores.put(129, "cento e vinte e nove");
        valores.put(130, "cento e trinta");
        valores.put(131, "cento e trinta e um");
        valores.put(132, "cento e trinta e dois");
        valores.put(133, "cento e trinta e três");
        valores.put(134, "cento e trinta e quatro");
        valores.put(135, "cento e trinta e cinco");
        valores.put(136, "cento e trinta e seis");
        valores.put(137, "cento e trinta e sete");
        valores.put(138, "cento e trinta e oito");
        valores.put(139, "cento e trinta e nove");
        valores.put(140, "cento e quarenta");
        valores.put(141, "cento e quarenta e um");
        valores.put(142, "cento e quarenta e dois");
        valores.put(143, "cento e quarenta e três");
        valores.put(144, "cento e quarenta e quatro");
        valores.put(145, "cento e quarenta e cinco");
        valores.put(146, "cento e quarenta e seis");
        valores.put(147, "cento e quarenta e sete");
        valores.put(148, "cento e quarenta e oito");
        valores.put(149, "cento e quarenta e nove");
        valores.put(150, "cento e cinquenta");
        valores.put(151, "cento e cinquenta e um");
        valores.put(152, "cento e cinquenta e dois");
        valores.put(153, "cento e cinquenta e três");
        valores.put(154, "cento e cinquenta e quatro");
        valores.put(155, "cento e cinquenta e cinco");
        valores.put(156, "cento e cinquenta e seis");
        valores.put(157, "cento e cinquenta e sete");
        valores.put(158, "cento e cinquenta e oito");
        valores.put(159, "cento e cinquenta e nove");
        valores.put(160, "cento e sessenta");
        valores.put(161, "cento e sessenta e um");
        valores.put(162, "cento e sessenta e dois");
        valores.put(163, "cento e sessenta e três");
        valores.put(164, "cento e sessenta e quatro");
        valores.put(165, "cento e sessenta e cinco");
        valores.put(166, "cento e sessenta e seis");
        valores.put(167, "cento e sessenta e sete");
        valores.put(168, "cento e sessenta e oito");
        valores.put(169, "cento e sessenta e nove");
        valores.put(170, "cento e setenta");
        valores.put(171, "cento e setenta e um");
        valores.put(172, "cento e setenta e dois");
        valores.put(173, "cento e setenta e três");
        valores.put(174, "cento e setenta e quatro");
        valores.put(175, "cento e setenta e cinco");
        valores.put(176, "cento e setenta e seis");
        valores.put(177, "cento e setenta e sete");
        valores.put(178, "cento e setenta e oito");
        valores.put(179, "cento e setenta e nove");
        valores.put(180, "cento e oitenta");
        valores.put(181, "cento e oitenta e um");
        valores.put(182, "cento e oitenta e dois");
        valores.put(183, "cento e oitenta e três");
        valores.put(184, "cento e oitenta e quatro");
        valores.put(185, "cento e oitenta e cinco");
        valores.put(186, "cento e oitenta e seis");
        valores.put(187, "cento e oitenta e sete");
        valores.put(188, "cento e oitenta e oito");
        valores.put(189, "cento e oitenta e nove");
        valores.put(190, "cento e noventa");
        valores.put(191, "cento e noventa e um");
        valores.put(192, "cento e noventa e dois");
        valores.put(193, "cento e noventa e três");
        valores.put(194, "cento e noventa e quatro");
        valores.put(195, "cento e noventa e cinco");
        valores.put(196, "cento e noventa e seis");
        valores.put(197, "cento e noventa e sete");
        valores.put(198, "cento e noventa e oito");
        valores.put(199, "cento e noventa e nove");
        valores.put(200, "duzentos");
        valores.put(201, "duzentos e um");
        valores.put(202, "duzentos e dois");
        valores.put(203, "duzentos e três");
        valores.put(204, "duzentos e quatro");
        valores.put(205, "duzentos e cinco");
        valores.put(206, "duzentos e seis");
        valores.put(207, "duzentos e sete");
        valores.put(208, "duzentos e oito");
        valores.put(209, "duzentos e nove");
        valores.put(210, "duzentos e dez");
        valores.put(211, "duzentos e onze");
        valores.put(212, "duzentos e doze");
        valores.put(213, "duzentos e treze");
        valores.put(214, "duzentos e quatorze");
        valores.put(215, "duzentos e quinze");
        valores.put(216, "duzentos e dezesseis");
        valores.put(217, "duzentos e dezessete");
        valores.put(218, "duzentos e dezoito");
        valores.put(219, "duzentos e dezenove");
        valores.put(220, "duzentos e vinte");
        valores.put(221, "duzentos e vinte e um");
        valores.put(222, "duzentos e vinte e dois");
        valores.put(223, "duzentos e vinte e três");
        valores.put(224, "duzentos e vinte e quatro");
        valores.put(225, "duzentos e vinte e cinco");
        valores.put(226, "duzentos e vinte e seis");
        valores.put(227, "duzentos e vinte e sete");
        valores.put(228, "duzentos e vinte e oito");
        valores.put(229, "duzentos e vinte e nove");
        valores.put(230, "duzentos e trinta");
        valores.put(231, "duzentos e trinta e um");
        valores.put(232, "duzentos e trinta e dois");
        valores.put(233, "duzentos e trinta e três");
        valores.put(234, "duzentos e trinta e quatro");
        valores.put(235, "duzentos e trinta e cinco");
        valores.put(236, "duzentos e trinta e seis");
        valores.put(237, "duzentos e trinta e sete");
        valores.put(238, "duzentos e trinta e oito");
        valores.put(239, "duzentos e trinta e nove");
        valores.put(240, "duzentos e quarenta");
        valores.put(241, "duzentos e quarenta e um");
        valores.put(242, "duzentos e quarenta e dois");
        valores.put(243, "duzentos e quarenta e três");
        valores.put(244, "duzentos e quarenta e quatro");
        valores.put(245, "duzentos e quarenta e cinco");
        valores.put(246, "duzentos e quarenta e seis");
        valores.put(247, "duzentos e quarenta e sete");
        valores.put(248, "duzentos e quarenta e oito");
        valores.put(249, "duzentos e quarenta e nove");
        valores.put(250, "duzentos e cinquenta");
        valores.put(251, "duzentos e cinquenta e um");
        valores.put(252, "duzentos e cinquenta e dois");
        valores.put(253, "duzentos e cinquenta e três");
        valores.put(254, "duzentos e cinquenta e quatro");
        valores.put(255, "duzentos e cinquenta e cinco");
        valores.put(256, "duzentos e cinquenta e seis");
        valores.put(257, "duzentos e cinquenta e sete");
        valores.put(258, "duzentos e cinquenta e oito");
        valores.put(259, "duzentos e cinquenta e nove");
        valores.put(260, "duzentos e sessenta");
        valores.put(261, "duzentos e sessenta e um");
        valores.put(262, "duzentos e sessenta e dois");
        valores.put(263, "duzentos e sessenta e três");
        valores.put(264, "duzentos e sessenta e quatro");
        valores.put(265, "duzentos e sessenta e cinco");
        valores.put(266, "duzentos e sessenta e seis");
        valores.put(267, "duzentos e sessenta e sete");
        valores.put(268, "duzentos e sessenta e oito");
        valores.put(269, "duzentos e sessenta e nove");
        valores.put(270, "duzentos e setenta");
        valores.put(271, "duzentos e setenta e um");
        valores.put(272, "duzentos e setenta e dois");
        valores.put(273, "duzentos e setenta e três");
        valores.put(274, "duzentos e setenta e quatro");
        valores.put(275, "duzentos e setenta e cinco");
        valores.put(276, "duzentos e setenta e seis");
        valores.put(277, "duzentos e setenta e sete");
        valores.put(278, "duzentos e setenta e oito");
        valores.put(279, "duzentos e setenta e nove");
        valores.put(280, "duzentos e oitenta");
        valores.put(281, "duzentos e oitenta e um");
        valores.put(282, "duzentos e oitenta e dois");
        valores.put(283, "duzentos e oitenta e três");
        valores.put(284, "duzentos e oitenta e quatro");
        valores.put(285, "duzentos e oitenta e cinco");
        valores.put(286, "duzentos e oitenta e seis");
        valores.put(287, "duzentos e oitenta e sete");
        valores.put(288, "duzentos e oitenta e oito");
        valores.put(289, "duzentos e oitenta e nove");
        valores.put(290, "duzentos e noventa");
        valores.put(291, "duzentos e noventa e um");
        valores.put(292, "duzentos e noventa e dois");
        valores.put(293, "duzentos e noventa e três");
        valores.put(294, "duzentos e noventa e quatro");
        valores.put(295, "duzentos e noventa e cinco");
        valores.put(296, "duzentos e noventa e seis");
        valores.put(297, "duzentos e noventa e sete");
        valores.put(298, "duzentos e noventa e oito");
        valores.put(299, "duzentos e noventa e nove");
        valores.put(300, "trezentos");
        valores.put(301, "trezentos e um");
        valores.put(302, "trezentos e dois");
        valores.put(303, "trezentos e três");
        valores.put(304, "trezentos e quatro");
        valores.put(305, "trezentos e cinco");
        valores.put(306, "trezentos e seis");
        valores.put(307, "trezentos e sete");
        valores.put(308, "trezentos e oito");
        valores.put(309, "trezentos e nove");
        valores.put(310, "trezentos e dez");
        valores.put(311, "trezentos e onze");
        valores.put(312, "trezentos e doze");
        valores.put(313, "trezentos e treze");
        valores.put(314, "trezentos e quatorze");
        valores.put(315, "trezentos e quinze");
        valores.put(316, "trezentos e dezesseis");
        valores.put(317, "trezentos e dezessete");
        valores.put(318, "trezentos e dezoito");
        valores.put(319, "trezentos e dezenove");
        valores.put(320, "trezentos e vinte");
        valores.put(321, "trezentos e vinte e um");
        valores.put(322, "trezentos e vinte e dois");
        valores.put(323, "trezentos e vinte e três");
        valores.put(324, "trezentos e vinte e quatro");
        valores.put(325, "trezentos e vinte e cinco");
        valores.put(326, "trezentos e vinte e seis");
        valores.put(327, "trezentos e vinte e sete");
        valores.put(328, "trezentos e vinte e oito");
        valores.put(329, "trezentos e vinte e nove");
        valores.put(330, "trezentos e trinta");
        valores.put(331, "trezentos e trinta e um");
        valores.put(332, "trezentos e trinta e dois");
        valores.put(333, "trezentos e trinta e três");
        valores.put(334, "trezentos e trinta e quatro");
        valores.put(335, "trezentos e trinta e cinco");
        valores.put(336, "trezentos e trinta e seis");
        valores.put(337, "trezentos e trinta e sete");
        valores.put(338, "trezentos e trinta e oito");
        valores.put(339, "trezentos e trinta e nove");
        valores.put(340, "trezentos e quarenta");
        valores.put(341, "trezentos e quarenta e um");
        valores.put(342, "trezentos e quarenta e dois");
        valores.put(343, "trezentos e quarenta e três");
        valores.put(344, "trezentos e quarenta e quatro");
        valores.put(345, "trezentos e quarenta e cinco");
        valores.put(346, "trezentos e quarenta e seis");
        valores.put(347, "trezentos e quarenta e sete");
        valores.put(348, "trezentos e quarenta e oito");
        valores.put(349, "trezentos e quarenta e nove");
        valores.put(350, "trezentos e cinquenta");
        valores.put(351, "trezentos e cinquenta e um");
        valores.put(352, "trezentos e cinquenta e dois");
        valores.put(353, "trezentos e cinquenta e três");
        valores.put(354, "trezentos e cinquenta e quatro");
        valores.put(355, "trezentos e cinquenta e cinco");
        valores.put(356, "trezentos e cinquenta e seis");
        valores.put(357, "trezentos e cinquenta e sete");
        valores.put(358, "trezentos e cinquenta e oito");
        valores.put(359, "trezentos e cinquenta e nove");
        valores.put(360, "trezentos e sessenta");
        valores.put(361, "trezentos e sessenta e um");
        valores.put(362, "trezentos e sessenta e dois");
        valores.put(363, "trezentos e sessenta e três");
        valores.put(364, "trezentos e sessenta e quatro");
        valores.put(365, "trezentos e sessenta e cinco");
        valores.put(366, "trezentos e sessenta e seis");
        valores.put(367, "trezentos e sessenta e sete");
        valores.put(368, "trezentos e sessenta e oito");
        valores.put(369, "trezentos e sessenta e nove");
        valores.put(370, "trezentos e setenta");
        valores.put(371, "trezentos e setenta e um");
        valores.put(372, "trezentos e setenta e dois");
        valores.put(373, "trezentos e setenta e três");
        valores.put(374, "trezentos e setenta e quatro");
        valores.put(375, "trezentos e setenta e cinco");
        valores.put(376, "trezentos e setenta e seis");
        valores.put(377, "trezentos e setenta e sete");
        valores.put(378, "trezentos e setenta e oito");
        valores.put(379, "trezentos e setenta e nove");
        valores.put(380, "trezentos e oitenta");
        valores.put(381, "trezentos e oitenta e um");
        valores.put(382, "trezentos e oitenta e dois");
        valores.put(383, "trezentos e oitenta e três");
        valores.put(384, "trezentos e oitenta e quatro");
        valores.put(385, "trezentos e oitenta e cinco");
        valores.put(386, "trezentos e oitenta e seis");
        valores.put(387, "trezentos e oitenta e sete");
        valores.put(388, "trezentos e oitenta e oito");
        valores.put(389, "trezentos e oitenta e nove");
        valores.put(390, "trezentos e noventa");
        valores.put(391, "trezentos e noventa e um");
        valores.put(392, "trezentos e noventa e dois");
        valores.put(393, "trezentos e noventa e três");
        valores.put(394, "trezentos e noventa e quatro");
        valores.put(395, "trezentos e noventa e cinco");
        valores.put(396, "trezentos e noventa e seis");
        valores.put(397, "trezentos e noventa e sete");
        valores.put(398, "trezentos e noventa e oito");
        valores.put(399, "trezentos e noventa e nove");
        valores.put(400, "quatrocentos");
        valores.put(401, "quatrocentos e um");
        valores.put(402, "quatrocentos e dois");
        valores.put(403, "quatrocentos e três");
        valores.put(404, "quatrocentos e quatro");
        valores.put(405, "quatrocentos e cinco");
        valores.put(406, "quatrocentos e seis");
        valores.put(407, "quatrocentos e sete");
        valores.put(408, "quatrocentos e oito");
        valores.put(409, "quatrocentos e nove");
        valores.put(410, "quatrocentos e dez");
        valores.put(411, "quatrocentos e onze");
        valores.put(412, "quatrocentos e doze");
        valores.put(413, "quatrocentos e treze");
        valores.put(414, "quatrocentos e quatorze");
        valores.put(415, "quatrocentos e quinze");
        valores.put(416, "quatrocentos e dezesseis");
        valores.put(417, "quatrocentos e dezessete");
        valores.put(418, "quatrocentos e dezoito");
        valores.put(419, "quatrocentos e dezenove");
        valores.put(420, "quatrocentos e vinte");
        valores.put(421, "quatrocentos e vinte e um");
        valores.put(422, "quatrocentos e vinte e dois");
        valores.put(423, "quatrocentos e vinte e três");
        valores.put(424, "quatrocentos e vinte e quatro");
        valores.put(425, "quatrocentos e vinte e cinco");
        valores.put(426, "quatrocentos e vinte e seis");
        valores.put(427, "quatrocentos e vinte e sete");
        valores.put(428, "quatrocentos e vinte e oito");
        valores.put(429, "quatrocentos e vinte e nove");
        valores.put(430, "quatrocentos e trinta");
        valores.put(431, "quatrocentos e trinta e um");
        valores.put(432, "quatrocentos e trinta e dois");
        valores.put(433, "quatrocentos e trinta e três");
        valores.put(434, "quatrocentos e trinta e quatro");
        valores.put(435, "quatrocentos e trinta e cinco");
        valores.put(436, "quatrocentos e trinta e seis");
        valores.put(437, "quatrocentos e trinta e sete");
        valores.put(438, "quatrocentos e trinta e oito");
        valores.put(439, "quatrocentos e trinta e nove");
        valores.put(440, "quatrocentos e quarenta");
        valores.put(441, "quatrocentos e quarenta e um");
        valores.put(442, "quatrocentos e quarenta e dois");
        valores.put(443, "quatrocentos e quarenta e três");
        valores.put(444, "quatrocentos e quarenta e quatro");
        valores.put(445, "quatrocentos e quarenta e cinco");
        valores.put(446, "quatrocentos e quarenta e seis");
        valores.put(447, "quatrocentos e quarenta e sete");
        valores.put(448, "quatrocentos e quarenta e oito");
        valores.put(449, "quatrocentos e quarenta e nove");
        valores.put(450, "quatrocentos e cinquenta");
        valores.put(451, "quatrocentos e cinquenta e um");
        valores.put(452, "quatrocentos e cinquenta e dois");
        valores.put(453, "quatrocentos e cinquenta e três");
        valores.put(454, "quatrocentos e cinquenta e quatro");
        valores.put(455, "quatrocentos e cinquenta e cinco");
        valores.put(456, "quatrocentos e cinquenta e seis");
        valores.put(457, "quatrocentos e cinquenta e sete");
        valores.put(458, "quatrocentos e cinquenta e oito");
        valores.put(459, "quatrocentos e cinquenta e nove");
        valores.put(460, "quatrocentos e sessenta");
        valores.put(461, "quatrocentos e sessenta e um");
        valores.put(462, "quatrocentos e sessenta e dois");
        valores.put(463, "quatrocentos e sessenta e três");
        valores.put(464, "quatrocentos e sessenta e quatro");
        valores.put(465, "quatrocentos e sessenta e cinco");
        valores.put(466, "quatrocentos e sessenta e seis");
        valores.put(467, "quatrocentos e sessenta e sete");
        valores.put(468, "quatrocentos e sessenta e oito");
        valores.put(469, "quatrocentos e sessenta e nove");
        valores.put(470, "quatrocentos e setenta");
        valores.put(471, "quatrocentos e setenta e um");
        valores.put(472, "quatrocentos e setenta e dois");
        valores.put(473, "quatrocentos e setenta e três");
        valores.put(474, "quatrocentos e setenta e quatro");
        valores.put(475, "quatrocentos e setenta e cinco");
        valores.put(476, "quatrocentos e setenta e seis");
        valores.put(477, "quatrocentos e setenta e sete");
        valores.put(478, "quatrocentos e setenta e oito");
        valores.put(479, "quatrocentos e setenta e nove");
        valores.put(480, "quatrocentos e oitenta");
        valores.put(481, "quatrocentos e oitenta e um");
        valores.put(482, "quatrocentos e oitenta e dois");
        valores.put(483, "quatrocentos e oitenta e três");
        valores.put(484, "quatrocentos e oitenta e quatro");
        valores.put(485, "quatrocentos e oitenta e cinco");
        valores.put(486, "quatrocentos e oitenta e seis");
        valores.put(487, "quatrocentos e oitenta e sete");
        valores.put(488, "quatrocentos e oitenta e oito");
        valores.put(489, "quatrocentos e oitenta e nove");
        valores.put(490, "quatrocentos e noventa");
        valores.put(491, "quatrocentos e noventa e um");
        valores.put(492, "quatrocentos e noventa e dois");
        valores.put(493, "quatrocentos e noventa e três");
        valores.put(494, "quatrocentos e noventa e quatro");
        valores.put(495, "quatrocentos e noventa e cinco");
        valores.put(496, "quatrocentos e noventa e seis");
        valores.put(497, "quatrocentos e noventa e sete");
        valores.put(498, "quatrocentos e noventa e oito");
        valores.put(499, "quatrocentos e noventa e nove");
        valores.put(500, "quinhentos");
        valores.put(501, "quinhentos e um");
        valores.put(502, "quinhentos e dois");
        valores.put(503, "quinhentos e três");
        valores.put(504, "quinhentos e quatro");
        valores.put(505, "quinhentos e cinco");
        valores.put(506, "quinhentos e seis");
        valores.put(507, "quinhentos e sete");
        valores.put(508, "quinhentos e oito");
        valores.put(509, "quinhentos e nove");
        valores.put(510, "quinhentos e dez");
        valores.put(511, "quinhentos e onze");
        valores.put(512, "quinhentos e doze");
        valores.put(513, "quinhentos e treze");
        valores.put(514, "quinhentos e quatorze");
        valores.put(515, "quinhentos e quinze");
        valores.put(516, "quinhentos e dezesseis");
        valores.put(517, "quinhentos e dezessete");
        valores.put(518, "quinhentos e dezoito");
        valores.put(519, "quinhentos e dezenove");
        valores.put(520, "quinhentos e vinte");
        valores.put(521, "quinhentos e vinte e um");
        valores.put(522, "quinhentos e vinte e dois");
        valores.put(523, "quinhentos e vinte e três");
        valores.put(524, "quinhentos e vinte e quatro");
        valores.put(525, "quinhentos e vinte e cinco");
        valores.put(526, "quinhentos e vinte e seis");
        valores.put(527, "quinhentos e vinte e sete");
        valores.put(528, "quinhentos e vinte e oito");
        valores.put(529, "quinhentos e vinte e nove");
        valores.put(530, "quinhentos e trinta");
        valores.put(531, "quinhentos e trinta e um");
        valores.put(532, "quinhentos e trinta e dois");
        valores.put(533, "quinhentos e trinta e três");
        valores.put(534, "quinhentos e trinta e quatro");
        valores.put(535, "quinhentos e trinta e cinco");
        valores.put(536, "quinhentos e trinta e seis");
        valores.put(537, "quinhentos e trinta e sete");
        valores.put(538, "quinhentos e trinta e oito");
        valores.put(539, "quinhentos e trinta e nove");
        valores.put(540, "quinhentos e quarenta");
        valores.put(541, "quinhentos e quarenta e um");
        valores.put(542, "quinhentos e quarenta e dois");
        valores.put(543, "quinhentos e quarenta e três");
        valores.put(544, "quinhentos e quarenta e quatro");
        valores.put(545, "quinhentos e quarenta e cinco");
        valores.put(546, "quinhentos e quarenta e seis");
        valores.put(547, "quinhentos e quarenta e sete");
        valores.put(548, "quinhentos e quarenta e oito");
        valores.put(549, "quinhentos e quarenta e nove");
        valores.put(550, "quinhentos e cinquenta");
        valores.put(551, "quinhentos e cinquenta e um");
        valores.put(552, "quinhentos e cinquenta e dois");
        valores.put(553, "quinhentos e cinquenta e três");
        valores.put(554, "quinhentos e cinquenta e quatro");
        valores.put(555, "quinhentos e cinquenta e cinco");
        valores.put(556, "quinhentos e cinquenta e seis");
        valores.put(557, "quinhentos e cinquenta e sete");
        valores.put(558, "quinhentos e cinquenta e oito");
        valores.put(559, "quinhentos e cinquenta e nove");
        valores.put(560, "quinhentos e sessenta");
        valores.put(561, "quinhentos e sessenta e um");
        valores.put(562, "quinhentos e sessenta e dois");
        valores.put(563, "quinhentos e sessenta e três");
        valores.put(564, "quinhentos e sessenta e quatro");
        valores.put(565, "quinhentos e sessenta e cinco");
        valores.put(566, "quinhentos e sessenta e seis");
        valores.put(567, "quinhentos e sessenta e sete");
        valores.put(568, "quinhentos e sessenta e oito");
        valores.put(569, "quinhentos e sessenta e nove");
        valores.put(570, "quinhentos e setenta");
        valores.put(571, "quinhentos e setenta e um");
        valores.put(572, "quinhentos e setenta e dois");
        valores.put(573, "quinhentos e setenta e três");
        valores.put(574, "quinhentos e setenta e quatro");
        valores.put(575, "quinhentos e setenta e cinco");
        valores.put(576, "quinhentos e setenta e seis");
        valores.put(577, "quinhentos e setenta e sete");
        valores.put(578, "quinhentos e setenta e oito");
        valores.put(579, "quinhentos e setenta e nove");
        valores.put(580, "quinhentos e oitenta");
        valores.put(581, "quinhentos e oitenta e um");
        valores.put(582, "quinhentos e oitenta e dois");
        valores.put(583, "quinhentos e oitenta e três");
        valores.put(584, "quinhentos e oitenta e quatro");
        valores.put(585, "quinhentos e oitenta e cinco");
        valores.put(586, "quinhentos e oitenta e seis");
        valores.put(587, "quinhentos e oitenta e sete");
        valores.put(588, "quinhentos e oitenta e oito");
        valores.put(589, "quinhentos e oitenta e nove");
        valores.put(590, "quinhentos e noventa");
        valores.put(591, "quinhentos e noventa e um");
        valores.put(592, "quinhentos e noventa e dois");
        valores.put(593, "quinhentos e noventa e três");
        valores.put(594, "quinhentos e noventa e quatro");
        valores.put(595, "quinhentos e noventa e cinco");
        valores.put(596, "quinhentos e noventa e seis");
        valores.put(597, "quinhentos e noventa e sete");
        valores.put(598, "quinhentos e noventa e oito");
        valores.put(599, "quinhentos e noventa e nove");
        valores.put(600, "seiscentos");
        valores.put(601, "seiscentos e um");
        valores.put(602, "seiscentos e dois");
        valores.put(603, "seiscentos e três");
        valores.put(604, "seiscentos e quatro");
        valores.put(605, "seiscentos e cinco");
        valores.put(606, "seiscentos e seis");
        valores.put(607, "seiscentos e sete");
        valores.put(608, "seiscentos e oito");
        valores.put(609, "seiscentos e nove");
        valores.put(610, "seiscentos e dez");
        valores.put(611, "seiscentos e onze");
        valores.put(612, "seiscentos e doze");
        valores.put(613, "seiscentos e treze");
        valores.put(614, "seiscentos e quatorze");
        valores.put(615, "seiscentos e quinze");
        valores.put(616, "seiscentos e dezesseis");
        valores.put(617, "seiscentos e dezessete");
        valores.put(618, "seiscentos e dezoito");
        valores.put(619, "seiscentos e dezenove");
        valores.put(620, "seiscentos e vinte");
        valores.put(621, "seiscentos e vinte e um");
        valores.put(622, "seiscentos e vinte e dois");
        valores.put(623, "seiscentos e vinte e três");
        valores.put(624, "seiscentos e vinte e quatro");
        valores.put(625, "seiscentos e vinte e cinco");
        valores.put(626, "seiscentos e vinte e seis");
        valores.put(627, "seiscentos e vinte e sete");
        valores.put(628, "seiscentos e vinte e oito");
        valores.put(629, "seiscentos e vinte e nove");
        valores.put(630, "seiscentos e trinta");
        valores.put(631, "seiscentos e trinta e um");
        valores.put(632, "seiscentos e trinta e dois");
        valores.put(633, "seiscentos e trinta e três");
        valores.put(634, "seiscentos e trinta e quatro");
        valores.put(635, "seiscentos e trinta e cinco");
        valores.put(636, "seiscentos e trinta e seis");
        valores.put(637, "seiscentos e trinta e sete");
        valores.put(638, "seiscentos e trinta e oito");
        valores.put(639, "seiscentos e trinta e nove");
        valores.put(640, "seiscentos e quarenta");
        valores.put(641, "seiscentos e quarenta e um");
        valores.put(642, "seiscentos e quarenta e dois");
        valores.put(643, "seiscentos e quarenta e três");
        valores.put(644, "seiscentos e quarenta e quatro");
        valores.put(645, "seiscentos e quarenta e cinco");
        valores.put(646, "seiscentos e quarenta e seis");
        valores.put(647, "seiscentos e quarenta e sete");
        valores.put(648, "seiscentos e quarenta e oito");
        valores.put(649, "seiscentos e quarenta e nove");
        valores.put(650, "seiscentos e cinquenta");
        valores.put(651, "seiscentos e cinquenta e um");
        valores.put(652, "seiscentos e cinquenta e dois");
        valores.put(653, "seiscentos e cinquenta e três");
        valores.put(654, "seiscentos e cinquenta e quatro");
        valores.put(655, "seiscentos e cinquenta e cinco");
        valores.put(656, "seiscentos e cinquenta e seis");
        valores.put(657, "seiscentos e cinquenta e sete");
        valores.put(658, "seiscentos e cinquenta e oito");
        valores.put(659, "seiscentos e cinquenta e nove");
        valores.put(660, "seiscentos e sessenta");
        valores.put(661, "seiscentos e sessenta e um");
        valores.put(662, "seiscentos e sessenta e dois");
        valores.put(663, "seiscentos e sessenta e três");
        valores.put(664, "seiscentos e sessenta e quatro");
        valores.put(665, "seiscentos e sessenta e cinco");
        valores.put(666, "seiscentos e sessenta e seis");
        valores.put(667, "seiscentos e sessenta e sete");
        valores.put(668, "seiscentos e sessenta e oito");
        valores.put(669, "seiscentos e sessenta e nove");
        valores.put(670, "seiscentos e setenta");
        valores.put(671, "seiscentos e setenta e um");
        valores.put(672, "seiscentos e setenta e dois");
        valores.put(673, "seiscentos e setenta e três");
        valores.put(674, "seiscentos e setenta e quatro");
        valores.put(675, "seiscentos e setenta e cinco");
        valores.put(676, "seiscentos e setenta e seis");
        valores.put(677, "seiscentos e setenta e sete");
        valores.put(678, "seiscentos e setenta e oito");
        valores.put(679, "seiscentos e setenta e nove");
        valores.put(680, "seiscentos e oitenta");
        valores.put(681, "seiscentos e oitenta e um");
        valores.put(682, "seiscentos e oitenta e dois");
        valores.put(683, "seiscentos e oitenta e três");
        valores.put(684, "seiscentos e oitenta e quatro");
        valores.put(685, "seiscentos e oitenta e cinco");
        valores.put(686, "seiscentos e oitenta e seis");
        valores.put(687, "seiscentos e oitenta e sete");
        valores.put(688, "seiscentos e oitenta e oito");
        valores.put(689, "seiscentos e oitenta e nove");
        valores.put(690, "seiscentos e noventa");
        valores.put(691, "seiscentos e noventa e um");
        valores.put(692, "seiscentos e noventa e dois");
        valores.put(693, "seiscentos e noventa e três");
        valores.put(694, "seiscentos e noventa e quatro");
        valores.put(695, "seiscentos e noventa e cinco");
        valores.put(696, "seiscentos e noventa e seis");
        valores.put(697, "seiscentos e noventa e sete");
        valores.put(698, "seiscentos e noventa e oito");
        valores.put(699, "seiscentos e noventa e nove");
        valores.put(700, "setecentos");
        valores.put(701, "setecentos e um");
        valores.put(702, "setecentos e dois");
        valores.put(703, "setecentos e três");
        valores.put(704, "setecentos e quatro");
        valores.put(705, "setecentos e cinco");
        valores.put(706, "setecentos e seis");
        valores.put(707, "setecentos e sete");
        valores.put(708, "setecentos e oito");
        valores.put(709, "setecentos e nove");
        valores.put(710, "setecentos e dez");
        valores.put(711, "setecentos e onze");
        valores.put(712, "setecentos e doze");
        valores.put(713, "setecentos e treze");
        valores.put(714, "setecentos e quatorze");
        valores.put(715, "setecentos e quinze");
        valores.put(716, "setecentos e dezesseis");
        valores.put(717, "setecentos e dezessete");
        valores.put(718, "setecentos e dezoito");
        valores.put(719, "setecentos e dezenove");
        valores.put(720, "setecentos e vinte");
        valores.put(721, "setecentos e vinte e um");
        valores.put(722, "setecentos e vinte e dois");
        valores.put(723, "setecentos e vinte e três");
        valores.put(724, "setecentos e vinte e quatro");
        valores.put(725, "setecentos e vinte e cinco");
        valores.put(726, "setecentos e vinte e seis");
        valores.put(727, "setecentos e vinte e sete");
        valores.put(728, "setecentos e vinte e oito");
        valores.put(729, "setecentos e vinte e nove");
        valores.put(730, "setecentos e trinta");
        valores.put(731, "setecentos e trinta e um");
        valores.put(732, "setecentos e trinta e dois");
        valores.put(733, "setecentos e trinta e três");
        valores.put(734, "setecentos e trinta e quatro");
        valores.put(735, "setecentos e trinta e cinco");
        valores.put(736, "setecentos e trinta e seis");
        valores.put(737, "setecentos e trinta e sete");
        valores.put(738, "setecentos e trinta e oito");
        valores.put(739, "setecentos e trinta e nove");
        valores.put(740, "setecentos e quarenta");
        valores.put(741, "setecentos e quarenta e um");
        valores.put(742, "setecentos e quarenta e dois");
        valores.put(743, "setecentos e quarenta e três");
        valores.put(744, "setecentos e quarenta e quatro");
        valores.put(745, "setecentos e quarenta e cinco");
        valores.put(746, "setecentos e quarenta e seis");
        valores.put(747, "setecentos e quarenta e sete");
        valores.put(748, "setecentos e quarenta e oito");
        valores.put(749, "setecentos e quarenta e nove");
        valores.put(750, "setecentos e cinquenta");
        valores.put(751, "setecentos e cinquenta e um");
        valores.put(752, "setecentos e cinquenta e dois");
        valores.put(753, "setecentos e cinquenta e três");
        valores.put(754, "setecentos e cinquenta e quatro");
        valores.put(755, "setecentos e cinquenta e cinco");
        valores.put(756, "setecentos e cinquenta e seis");
        valores.put(757, "setecentos e cinquenta e sete");
        valores.put(758, "setecentos e cinquenta e oito");
        valores.put(759, "setecentos e cinquenta e nove");
        valores.put(760, "setecentos e sessenta");
        valores.put(761, "setecentos e sessenta e um");
        valores.put(762, "setecentos e sessenta e dois");
        valores.put(763, "setecentos e sessenta e três");
        valores.put(764, "setecentos e sessenta e quatro");
        valores.put(765, "setecentos e sessenta e cinco");
        valores.put(766, "setecentos e sessenta e seis");
        valores.put(767, "setecentos e sessenta e sete");
        valores.put(768, "setecentos e sessenta e oito");
        valores.put(769, "setecentos e sessenta e nove");
        valores.put(770, "setecentos e setenta");
        valores.put(771, "setecentos e setenta e um");
        valores.put(772, "setecentos e setenta e dois");
        valores.put(773, "setecentos e setenta e três");
        valores.put(774, "setecentos e setenta e quatro");
        valores.put(775, "setecentos e setenta e cinco");
        valores.put(776, "setecentos e setenta e seis");
        valores.put(777, "setecentos e setenta e sete");
        valores.put(778, "setecentos e setenta e oito");
        valores.put(779, "setecentos e setenta e nove");
        valores.put(780, "setecentos e oitenta");
        valores.put(781, "setecentos e oitenta e um");
        valores.put(782, "setecentos e oitenta e dois");
        valores.put(783, "setecentos e oitenta e três");
        valores.put(784, "setecentos e oitenta e quatro");
        valores.put(785, "setecentos e oitenta e cinco");
        valores.put(786, "setecentos e oitenta e seis");
        valores.put(787, "setecentos e oitenta e sete");
        valores.put(788, "setecentos e oitenta e oito");
        valores.put(789, "setecentos e oitenta e nove");
        valores.put(790, "setecentos e noventa");
        valores.put(791, "setecentos e noventa e um");
        valores.put(792, "setecentos e noventa e dois");
        valores.put(793, "setecentos e noventa e três");
        valores.put(794, "setecentos e noventa e quatro");
        valores.put(795, "setecentos e noventa e cinco");
        valores.put(796, "setecentos e noventa e seis");
        valores.put(797, "setecentos e noventa e sete");
        valores.put(798, "setecentos e noventa e oito");
        valores.put(799, "setecentos e noventa e nove");
        valores.put(800, "oitocentos");
        valores.put(801, "oitocentos e um");
        valores.put(802, "oitocentos e dois");
        valores.put(803, "oitocentos e três");
        valores.put(804, "oitocentos e quatro");
        valores.put(805, "oitocentos e cinco");
        valores.put(806, "oitocentos e seis");
        valores.put(807, "oitocentos e sete");
        valores.put(808, "oitocentos e oito");
        valores.put(809, "oitocentos e nove");
        valores.put(810, "oitocentos e dez");
        valores.put(811, "oitocentos e onze");
        valores.put(812, "oitocentos e doze");
        valores.put(813, "oitocentos e treze");
        valores.put(814, "oitocentos e quatorze");
        valores.put(815, "oitocentos e quinze");
        valores.put(816, "oitocentos e dezesseis");
        valores.put(817, "oitocentos e dezessete");
        valores.put(818, "oitocentos e dezoito");
        valores.put(819, "oitocentos e dezenove");
        valores.put(820, "oitocentos e vinte");
        valores.put(821, "oitocentos e vinte e um");
        valores.put(822, "oitocentos e vinte e dois");
        valores.put(823, "oitocentos e vinte e três");
        valores.put(824, "oitocentos e vinte e quatro");
        valores.put(825, "oitocentos e vinte e cinco");
        valores.put(826, "oitocentos e vinte e seis");
        valores.put(827, "oitocentos e vinte e sete");
        valores.put(828, "oitocentos e vinte e oito");
        valores.put(829, "oitocentos e vinte e nove");
        valores.put(830, "oitocentos e trinta");
        valores.put(831, "oitocentos e trinta e um");
        valores.put(832, "oitocentos e trinta e dois");
        valores.put(833, "oitocentos e trinta e três");
        valores.put(834, "oitocentos e trinta e quatro");
        valores.put(835, "oitocentos e trinta e cinco");
        valores.put(836, "oitocentos e trinta e seis");
        valores.put(837, "oitocentos e trinta e sete");
        valores.put(838, "oitocentos e trinta e oito");
        valores.put(839, "oitocentos e trinta e nove");
        valores.put(840, "oitocentos e quarenta");
        valores.put(841, "oitocentos e quarenta e um");
        valores.put(842, "oitocentos e quarenta e dois");
        valores.put(843, "oitocentos e quarenta e três");
        valores.put(844, "oitocentos e quarenta e quatro");
        valores.put(845, "oitocentos e quarenta e cinco");
        valores.put(846, "oitocentos e quarenta e seis");
        valores.put(847, "oitocentos e quarenta e sete");
        valores.put(848, "oitocentos e quarenta e oito");
        valores.put(849, "oitocentos e quarenta e nove");
        valores.put(850, "oitocentos e cinquenta");
        valores.put(851, "oitocentos e cinquenta e um");
        valores.put(852, "oitocentos e cinquenta e dois");
        valores.put(853, "oitocentos e cinquenta e três");
        valores.put(854, "oitocentos e cinquenta e quatro");
        valores.put(855, "oitocentos e cinquenta e cinco");
        valores.put(856, "oitocentos e cinquenta e seis");
        valores.put(857, "oitocentos e cinquenta e sete");
        valores.put(858, "oitocentos e cinquenta e oito");
        valores.put(859, "oitocentos e cinquenta e nove");
        valores.put(860, "oitocentos e sessenta");
        valores.put(861, "oitocentos e sessenta e um");
        valores.put(862, "oitocentos e sessenta e dois");
        valores.put(863, "oitocentos e sessenta e três");
        valores.put(864, "oitocentos e sessenta e quatro");
        valores.put(865, "oitocentos e sessenta e cinco");
        valores.put(866, "oitocentos e sessenta e seis");
        valores.put(867, "oitocentos e sessenta e sete");
        valores.put(868, "oitocentos e sessenta e oito");
        valores.put(869, "oitocentos e sessenta e nove");
        valores.put(870, "oitocentos e setenta");
        valores.put(871, "oitocentos e setenta e um");
        valores.put(872, "oitocentos e setenta e dois");
        valores.put(873, "oitocentos e setenta e três");
        valores.put(874, "oitocentos e setenta e quatro");
        valores.put(875, "oitocentos e setenta e cinco");
        valores.put(876, "oitocentos e setenta e seis");
        valores.put(877, "oitocentos e setenta e sete");
        valores.put(878, "oitocentos e setenta e oito");
        valores.put(879, "oitocentos e setenta e nove");
        valores.put(880, "oitocentos e oitenta");
        valores.put(881, "oitocentos e oitenta e um");
        valores.put(882, "oitocentos e oitenta e dois");
        valores.put(883, "oitocentos e oitenta e três");
        valores.put(884, "oitocentos e oitenta e quatro");
        valores.put(885, "oitocentos e oitenta e cinco");
        valores.put(886, "oitocentos e oitenta e seis");
        valores.put(887, "oitocentos e oitenta e sete");
        valores.put(888, "oitocentos e oitenta e oito");
        valores.put(889, "oitocentos e oitenta e nove");
        valores.put(890, "oitocentos e noventa");
        valores.put(891, "oitocentos e noventa e um");
        valores.put(892, "oitocentos e noventa e dois");
        valores.put(893, "oitocentos e noventa e três");
        valores.put(894, "oitocentos e noventa e quatro");
        valores.put(895, "oitocentos e noventa e cinco");
        valores.put(896, "oitocentos e noventa e seis");
        valores.put(897, "oitocentos e noventa e sete");
        valores.put(898, "oitocentos e noventa e oito");
        valores.put(899, "oitocentos e noventa e nove");
        valores.put(900, "novecentos");
        valores.put(901, "novecentos e um");
        valores.put(902, "novecentos e dois");
        valores.put(903, "novecentos e três");
        valores.put(904, "novecentos e quatro");
        valores.put(905, "novecentos e cinco");
        valores.put(906, "novecentos e seis");
        valores.put(907, "novecentos e sete");
        valores.put(908, "novecentos e oito");
        valores.put(909, "novecentos e nove");
        valores.put(910, "novecentos e dez");
        valores.put(911, "novecentos e onze");
        valores.put(912, "novecentos e doze");
        valores.put(913, "novecentos e treze");
        valores.put(914, "novecentos e quatorze");
        valores.put(915, "novecentos e quinze");
        valores.put(916, "novecentos e dezesseis");
        valores.put(917, "novecentos e dezessete");
        valores.put(918, "novecentos e dezoito");
        valores.put(919, "novecentos e dezenove");
        valores.put(920, "novecentos e vinte");
        valores.put(921, "novecentos e vinte e um");
        valores.put(922, "novecentos e vinte e dois");
        valores.put(923, "novecentos e vinte e três");
        valores.put(924, "novecentos e vinte e quatro");
        valores.put(925, "novecentos e vinte e cinco");
        valores.put(926, "novecentos e vinte e seis");
        valores.put(927, "novecentos e vinte e sete");
        valores.put(928, "novecentos e vinte e oito");
        valores.put(929, "novecentos e vinte e nove");
        valores.put(930, "novecentos e trinta");
        valores.put(931, "novecentos e trinta e um");
        valores.put(932, "novecentos e trinta e dois");
        valores.put(933, "novecentos e trinta e três");
        valores.put(934, "novecentos e trinta e quatro");
        valores.put(935, "novecentos e trinta e cinco");
        valores.put(936, "novecentos e trinta e seis");
        valores.put(937, "novecentos e trinta e sete");
        valores.put(938, "novecentos e trinta e oito");
        valores.put(939, "novecentos e trinta e nove");
        valores.put(940, "novecentos e quarenta");
        valores.put(941, "novecentos e quarenta e um");
        valores.put(942, "novecentos e quarenta e dois");
        valores.put(943, "novecentos e quarenta e três");
        valores.put(944, "novecentos e quarenta e quatro");
        valores.put(945, "novecentos e quarenta e cinco");
        valores.put(946, "novecentos e quarenta e seis");
        valores.put(947, "novecentos e quarenta e sete");
        valores.put(948, "novecentos e quarenta e oito");
        valores.put(949, "novecentos e quarenta e nove");
        valores.put(950, "novecentos e cinquenta");
        valores.put(951, "novecentos e cinquenta e um");
        valores.put(952, "novecentos e cinquenta e dois");
        valores.put(953, "novecentos e cinquenta e três");
        valores.put(954, "novecentos e cinquenta e quatro");
        valores.put(955, "novecentos e cinquenta e cinco");
        valores.put(956, "novecentos e cinquenta e seis");
        valores.put(957, "novecentos e cinquenta e sete");
        valores.put(958, "novecentos e cinquenta e oito");
        valores.put(959, "novecentos e cinquenta e nove");
        valores.put(960, "novecentos e sessenta");
        valores.put(961, "novecentos e sessenta e um");
        valores.put(962, "novecentos e sessenta e dois");
        valores.put(963, "novecentos e sessenta e três");
        valores.put(964, "novecentos e sessenta e quatro");
        valores.put(965, "novecentos e sessenta e cinco");
        valores.put(966, "novecentos e sessenta e seis");
        valores.put(967, "novecentos e sessenta e sete");
        valores.put(968, "novecentos e sessenta e oito");
        valores.put(969, "novecentos e sessenta e nove");
        valores.put(970, "novecentos e setenta");
        valores.put(971, "novecentos e setenta e um");
        valores.put(972, "novecentos e setenta e dois");
        valores.put(973, "novecentos e setenta e três");
        valores.put(974, "novecentos e setenta e quatro");
        valores.put(975, "novecentos e setenta e cinco");
        valores.put(976, "novecentos e setenta e seis");
        valores.put(977, "novecentos e setenta e sete");
        valores.put(978, "novecentos e setenta e oito");
        valores.put(979, "novecentos e setenta e nove");
        valores.put(980, "novecentos e oitenta");
        valores.put(981, "novecentos e oitenta e um");
        valores.put(982, "novecentos e oitenta e dois");
        valores.put(983, "novecentos e oitenta e três");
        valores.put(984, "novecentos e oitenta e quatro");
        valores.put(985, "novecentos e oitenta e cinco");
        valores.put(986, "novecentos e oitenta e seis");
        valores.put(987, "novecentos e oitenta e sete");
        valores.put(988, "novecentos e oitenta e oito");
        valores.put(989, "novecentos e oitenta e nove");
        valores.put(990, "novecentos e noventa");
        valores.put(991, "novecentos e noventa e um");
        valores.put(992, "novecentos e noventa e dois");
        valores.put(993, "novecentos e noventa e três");
        valores.put(994, "novecentos e noventa e quatro");
        valores.put(995, "novecentos e noventa e cinco");
        valores.put(996, "novecentos e noventa e seis");
        valores.put(997, "novecentos e noventa e sete");
        valores.put(998, "novecentos e noventa e oito");
        valores.put(999, "novecentos e noventa e nove");
        valores.put(1000, "mil");
        valores.put(1000000, "milhão");
        valores.put(2000000, "milhões");
        valores.put(1000000000, "bilhão");
        valores.put(2000000000, "bilhões");

    }

    private String verificaCentavos(String[] argumento) throws Exception {
        try {
            String centavos = null;
            String numVerif = argumento[1];
            String concatVerif = String.valueOf(numVerif.charAt(0)) + String.valueOf(numVerif.charAt(1));

            if (argumento.length == 1 || concatVerif.equals("00")) {

                centavos = "";

            } else {

                String num = argumento[1];

                String concat = String.valueOf(num.charAt(0)) + String.valueOf(num.charAt(1));

                Integer cents = Integer.parseInt(concat);

                if (cents == 1) {

                    centavos = valores.get(cents) + " centavo.";

                } else {
                    centavos = valores.get(cents) + " centavos.";
                }

            }

            return centavos;
        } catch (Exception e) {

            throw new Exception(e);

        }

    }

    private String escreverExtenso(String argumento2) throws Exception {
        try {
            String retorno = "";

            Integer numEntered = Integer.parseInt(argumento2);

            if (numEntered != 0) {

                Integer numCaract = contaCaracteres(argumento2);

                switch (numCaract) {
                    case 1:
                        retorno = verificaUnidades(numEntered);
                        break;

                    case 2:
                        retorno = verificaDezenas(numEntered);
                        break;

                    case 3:
                        retorno = verificaCentenas(numEntered);
                        break;

                    case 4:
                        retorno = verificaMilhares(numEntered);
                        break;

                    case 5:
                        retorno = verificaDezenasMilhares(numEntered);
                        break;

                    case 6:
                        retorno = verificaCentenasMilhares(numEntered);
                        break;

                    case 7:
                        retorno = verificaMilhoes(numEntered);
                        break;

                }

            }

            return retorno;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private Integer contaCaracteres(String argumento2) throws Exception {
        try {
            Integer count = 0;

            String str = argumento2;

            for (int i = 0; i < str.length(); i++) {

                count++;
            }

            return count;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaUnidades(Integer numEntered) throws Exception {
        try {
            String retornaUnidade;

            Integer num = numEntered;

            if (num == 1) {

                retornaUnidade = valores.get(num) + " real";

            } else {

                retornaUnidade = valores.get(num) + " reais";

            }

            return retornaUnidade;

        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaDezenas(Integer numEntered) throws Exception {
        try {
            String retornaDezenas;

            Integer num = numEntered;

            if (num == 1) {

                retornaDezenas = valores.get(num) + " real";

            } else {

                retornaDezenas = valores.get(num) + " reais";

            }

            return retornaDezenas;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaCentenas(Integer numEntered) throws Exception {
        try {
            String retornaCentenas;

            Integer num = numEntered;

            if (num == 1) {

                retornaCentenas = valores.get(num) + " real";

            } else {

                retornaCentenas = valores.get(num) + " reais";
            }
            return retornaCentenas;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaMilhares(Integer numEntered) throws Exception {

        try {
            String retornaMilhares = "";

            String num = String.valueOf(numEntered);

            char fourth = num.charAt(0);

            String centena = String.valueOf(num.charAt(1)) + String.valueOf(num.charAt(2)) + String.valueOf(num.charAt(3));

            Integer aux = Integer.parseInt(centena);

            if (aux <= 99 && aux != 0) {

                retornaMilhares = valores.get(Integer.parseInt(String.valueOf(fourth))) + " mil" + " e " + valores.get(aux) + " reais";

            } else {

                retornaMilhares = valores.get(Integer.parseInt(String.valueOf(fourth))) + " mil " + valores.get(aux) + " reais";

            }

            if (aux == 0) {

                retornaMilhares = valores.get(Integer.parseInt(String.valueOf(fourth))) + " mil reais";

            }

            return retornaMilhares;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaDezenasMilhares(Integer numEntered) throws Exception {
        try {
            String retornaDezenasMilhares = "";

            String num = String.valueOf(numEntered);

            String fourth = String.valueOf(num.charAt(0)) + String.valueOf(num.charAt(1));

            String centena = String.valueOf(num.charAt(2)) + String.valueOf(num.charAt(3)) + String.valueOf(num.charAt(4));

            Integer aux = Integer.parseInt(centena);

            if (aux <= 99 && aux != 0) {

                retornaDezenasMilhares = valores.get(Integer.parseInt(fourth)) + " mil" + " e " + valores.get(aux) + " reais";

            } else {

                retornaDezenasMilhares = valores.get(Integer.parseInt(fourth)) + " mil " + valores.get(aux) + " reais";

            }

            if (aux == 0) {

                retornaDezenasMilhares = valores.get(Integer.parseInt(fourth)) + " mil reais";

            }

            return retornaDezenasMilhares;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaCentenasMilhares(Integer numEntered) throws Exception {
        try {
            String retornaCentenaMilhares = "";

            String num = String.valueOf(numEntered);

            String fourth = String.valueOf(num.charAt(0)) + String.valueOf(num.charAt(1)) + String.valueOf(num.charAt(2));

            String centena = String.valueOf(num.charAt(3)) + String.valueOf(num.charAt(4)) + String.valueOf(num.charAt(5));

            Integer aux = Integer.parseInt(centena);

            if (aux <= 99 && aux != 0) {

                retornaCentenaMilhares = valores.get(Integer.parseInt(fourth)) + " mil" + " e " + valores.get(aux) + " reais";

            } else {

                retornaCentenaMilhares = valores.get(Integer.parseInt(fourth)) + " mil " + valores.get(aux) + " reais";

            }

            if (aux == 0) {

                retornaCentenaMilhares = valores.get(Integer.parseInt(fourth)) + " mil reais";

            }

            return retornaCentenaMilhares;
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    private String verificaMilhoes(Integer numEntered) throws Exception {
        try {
            String retornaMilhoes = "";

            String num = String.valueOf(numEntered);

            String fourth = String.valueOf(num.charAt(0));

            String centena1 = String.valueOf(num.charAt(1)) + String.valueOf(num.charAt(2)) + String.valueOf(num.charAt(3));

            String centena2 = String.valueOf(num.charAt(4)) + String.valueOf(num.charAt(5)) + String.valueOf(num.charAt(6));

            Integer aux1 = Integer.parseInt(centena1);
            Integer aux2 = Integer.parseInt(centena2);

            if (aux1 == 0 && aux2 <= 99 && Integer.parseInt(fourth) == 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhão" + " e " + valores.get(aux2) + " reais";
            }

            if (aux1 == 0 && aux2 <= 99 && Integer.parseInt(fourth) > 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhões" + " e " + valores.get(aux2) + " reais";
            }

            if (aux1 > 0 && aux2 <= 99 && Integer.parseInt(fourth) == 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhão" + " e " + valores.get(aux1) + " mil e " + valores.get(aux2) + " reais";
            }

            if (aux1 > 0 && aux2 <= 99 && Integer.parseInt(fourth) > 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhões" + " e " + valores.get(aux1) + " mil e " + valores.get(aux2) + " reais";
            }

            if (aux1 > 0 && aux2 > 99 && Integer.parseInt(fourth) == 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhão" + " " + valores.get(aux1) + " mil e " + valores.get(aux2) + " reais";
            }

            if (aux1 > 0 && aux2 > 99 && Integer.parseInt(fourth) > 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhões" + " " + valores.get(aux1) + " mil " + valores.get(aux2) + " reais";
            }

            if (aux1 > 0 && aux2 == 0 && Integer.parseInt(fourth) == 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhão" + " " + valores.get(aux1) + " mil reais";
            }

            if (aux1 > 0 && aux2 == 0 && Integer.parseInt(fourth) > 1) {
                retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhões" + " " + valores.get(aux1) + " mil reais";
            }

            if (aux1 == 0 && aux2 == 0) {

                if (fourth.equals("1")) {

                    retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhão de reais";

                } else {

                    retornaMilhoes = valores.get(Integer.parseInt(fourth)) + " milhões de reais";

                }
            }

            return retornaMilhoes;

        } catch (Exception e) {
            throw new Exception(e);
        }

    }

}
