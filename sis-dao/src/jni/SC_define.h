#pragma once

#ifndef _SC_DEFINE_H__
#define _SC_DEFINE_H__


#define SC_MAX_DATACOUNT  1000	//������ݸ���

#define    SC_QUALITY_BAD             0x00
#define    SC_QUALITY_GOOD            0xC0
#define    SC_QUALITY_UNCERTAIN       0x40
#define    SC_QUALITY_NOT_CONNECTED   0x08
#define    SC_QUALITY_DEVICE_FAILURE  0x0c
#define    SC_QUALITY_SENSOR_FAILURE  0x10
#define    SC_QUALITY_LAST_KNOWN      0x14
#define    SC_QUALITY_COMM_FAILURE    0x18
#define    SC_QUALITY_OUT_OF_SERVICE  0x1C
#define    SC_QUALITY_CONFIG_ERROR    0x04


#define SC_RET_SUCCESS			0		//��ѯ�ɹ�
#define SC_RET_PARAERROR		-1		//��������
#define SC_RET_ENCERROR			-2		//��������
#define SC_RET_TIMEOUT			-3		//��ʱ����
#define SC_RET_FUNCERROR		-4		//ִ��ʧ��
#define SC_RET_NOPOINT			-5		//�����Ч
#define SC_RET_NODATA			-6		//������Ч
#define SC_RET_EXCEPTION		-7      //�쳣����
#define SC_RET_OTHERS			-8      //����


#endif